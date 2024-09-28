package com.interviewQuestion_DSA_Java.String_3.stringBulderandbuffer;

class StringBufferTask implements Runnable {
    private StringBuffer sb;

    public StringBufferTask(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sb.append(i).append(" ");
        }
    }
}

public class StringBuffer_ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        Thread t1 = new Thread(new StringBufferTask(sb));
        Thread t2 = new Thread(new StringBufferTask(sb));

        t1.start();
        t2.start();

        t1.join();  // Wait for thread t1 to finish
        t2.join();  // Wait for thread t2 to finish

        // Check the length of the final string
        System.out.println("StringBuffer length: " + sb.length());
        // Check the contents of the final string (should be correct and ordered)
        System.out.println("StringBuffer content: " + sb.toString().substring(0, 100) + "...");
    }
}

