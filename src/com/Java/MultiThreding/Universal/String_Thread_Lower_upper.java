package com.Java.MultiThreding.Universal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

class File_Thread {
    StringWriter sw = new StringWriter();

    void File1_String() throws IOException {
        File file = new File("Rishi/Rishi.txt");

        if (file.exists()) {
            System.out.println("File already exists..........");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully ........");
                }
            } catch (IOException e) {
                System.err.println("Error while creating file: " + e.getMessage());
            }
        }

        // Using StringWriter to write long character data
        sw.write("This is some sample text for StringWriter.\n" +
                "What is Compile time polymorphism (Static polymorphism)?\n" +
                "A polymorphism where object binding with methods happens at compile time is called static polymorphism or compile-time polymorphism.\n" +
                "In static polymorphism, the behavior of the method is decided at compile-time based on the parameters or arguments of the method.\n" +
                "How to achieve or implement static polymorphism in Java?\n" +
                "Static polymorphism can be achieved by method overloading. Other examples of compile time polymorphism are constructor overloading and method hiding.\n");

        System.out.println("\nData in StringWriter: \n" + sw.toString());

        // Writing content of StringWriter to a file using FileWriter
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(sw.toString());
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.err.println(STR."Error while writing to file: \{e.getMessage()}");
        }
    }

    StringWriter getStringWriter() {
        return sw;
    }
}

class File2_Thread extends Thread {
    private File_Thread fileThread;

    File2_Thread(File_Thread fileThread) {
        this.fileThread = fileThread;
    }

    public void run() {
        // Convert the content to uppercase
        String upperContent = fileThread.getStringWriter().toString().toUpperCase();
        File f2 = new File("Rishi/Ans/file2_UpperC.txt");

        try {
            if (f2.createNewFile()) {
                System.out.println("file2_UpperC.txt created successfully.");
            }

            // Writing the uppercase content to file2_UpperC.txt
            try (FileWriter fwUpper = new FileWriter(f2)) {
                fwUpper.write(upperContent);
                System.out.println("Uppercase content written to file2_UpperC.txt successfully.");
            } catch (IOException e) {
                System.err.println("Error while writing to file2_UpperC.txt: " + e.getMessage());
            }

            System.out.println(upperContent);
        } catch (IOException e) {
            System.err.println("Error while creating file2_UpperC.txt: " + e.getMessage());
        }
    }
}

class File3_Thread extends Thread {
    private File_Thread fileThread;

    File3_Thread(File_Thread fileThread) {
        this.fileThread = fileThread;
    }

    public void run() {
        // Convert the content to lowercase
        String lowerContent = fileThread.getStringWriter().toString().toLowerCase();
        File f3 = new File("Rishi/Ans/file2_LowerCase.txt");

        try {
            if (f3.createNewFile()) {
                System.out.println("file2_LowerC.txt created successfully.");
            }

            // Writing the lowercase content to file2_LowerCase.txt
            try (FileWriter fwLower = new FileWriter(f3)) {
                fwLower.write(lowerContent);
                System.out.println("Lowercase content written to file2_LowerC.txt successfully.");
            } catch (IOException e) {
                System.err.println("Error while writing to file2_LowerC.txt: " + e.getMessage());
            }

            System.out.println(lowerContent);
        } catch (IOException e) {
            System.err.println("Error while creating file2_LowerC.txt: " + e.getMessage());
        }
    }
}

public class String_Thread_Lower_upper {
    public static void main(String[] args) {
        File_Thread fileThread = new File_Thread();
        try {
            fileThread.File1_String();

            // Creating and starting threads for upper and lower case operations
            Thread upperThread = new File2_Thread(fileThread);
            Thread lowerThread = new File3_Thread(fileThread);

            upperThread.start();
            lowerThread.start();

            // Waiting for threads to finish
            upperThread.join();
            lowerThread.join();
        } catch (IOException | InterruptedException e) {
            System.err.println(STR."Error: \{e.getMessage()}");
        }
    }
}
