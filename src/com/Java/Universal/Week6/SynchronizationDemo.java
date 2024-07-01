package com.Java.Universal.Week6;

class Printer {
    // Synchronized method to print a document
    public synchronized void printDocument(Document document) {
        System.out.println(Thread.currentThread().getName() + " started printing: " + document.getName());
        try {
            // Simulate printing time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + document.getName());
    }
}

class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PrintJob implements Runnable {
    private Printer printer;
    private Document document;

    public PrintJob(Printer printer, Document document) {
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        printer.printDocument(document);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Document doc1 = new Document("Document1");
        Document doc2 = new Document("Document2");
        Document doc3 = new Document("Document3");

        Thread thread1 = new Thread(new PrintJob(printer, doc1), "Thread1");
        Thread thread2 = new Thread(new PrintJob(printer, doc2), "Thread2");
        Thread thread3 = new Thread(new PrintJob(printer, doc3), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
