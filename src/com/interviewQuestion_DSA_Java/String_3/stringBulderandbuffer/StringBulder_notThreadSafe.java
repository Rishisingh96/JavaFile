package com.interviewQuestion_DSA_Java.String_3.stringBulderandbuffer;

class StringBuilderTask implements Runnable {
    private StringBuilder sb;

    public StringBuilderTask(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sb.append(i).append(" ");
        }
    }
}

public class StringBulder_notThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();

        Thread t1 = new Thread(new StringBuilderTask(sb));
        Thread t2 = new Thread(new StringBuilderTask(sb));

        t1.start();
        t2.start();

        t1.join();  // Wait for thread t1 to finish
        t2.join();  // Wait for thread t2 to finish

        // Check the length of the final string
        System.out.println("StringBuilder length: " + sb.length());
        // Check the contents of the final string (might be unordered or incorrect)
        System.out.println("StringBuilder content: " + sb.toString().substring(0, 100) + "...");
    }
}

