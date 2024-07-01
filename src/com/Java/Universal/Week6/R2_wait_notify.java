package com.Java.Universal.Week6;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileAccessControl {
    private boolean isWriting = false;
    private int readers = 0;

    public synchronized void startReading() throws InterruptedException {
        while (isWriting) {
            wait();
        }
        readers++;
    }

    public synchronized void stopReading() {
        readers--;
        if (readers == 0) {
            notifyAll();
        }
    }

    public synchronized void startWriting() throws InterruptedException {
        while (isWriting || readers > 0) {
            wait();
        }
        isWriting = true;
    }

    public synchronized void stopWriting() {
        isWriting = false;
        notifyAll();
    }
}

class Reader implements Runnable {
    private FileAccessControl fileControl;

    public Reader(FileAccessControl fileControl) {
        this.fileControl = fileControl;
    }

    @Override
    public void run() {
        try {
            fileControl.startReading();
            readFile();
            fileControl.stopReading();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void readFile() {
        try {
            FileReader file = new FileReader("Teachers.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + " reads: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}

class Writer implements Runnable {
    private FileAccessControl fileControl;
    private String content;

    public Writer(FileAccessControl fileControl, String content) {
        this.fileControl = fileControl;
        this.content = content;
    }

    @Override
    public void run() {
        try {
            fileControl.startWriting();
            writeFile();
            fileControl.stopWriting();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void writeFile() {
        try {
            FileWriter file = new FileWriter("Teachers.txt", true); // Append mode
            file.write(content + "\n");
            file.close();
            System.out.println(Thread.currentThread().getName() + " wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
            e.printStackTrace();
        }
    }
}

public class R2_wait_notify {
    public static void main(String[] args) {
        FileAccessControl fileControl = new FileAccessControl();

        Thread writer1 = new Thread(new Writer(fileControl, "Name: John Doe, Age: 40"), "Writer1");
        Thread writer2 = new Thread(new Writer(fileControl, "Name: Jane Smith, Age: 30"), "Writer2");
        Thread reader1 = new Thread(new Reader(fileControl), "Reader1");
        Thread reader2 = new Thread(new Reader(fileControl), "Reader2");

        writer1.start();
        writer2.start();
        reader1.start();
        reader2.start();
    }
}
