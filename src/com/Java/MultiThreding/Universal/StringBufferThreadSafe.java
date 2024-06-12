package com.Java.MultiThreding.Universal;

class MyThread extends Thread {
    private StringBuffer stringBuffer;

    public MyThread(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            stringBuffer.append("Python");
            System.out.println(stringBuffer.toString());
        }
    }
}

class MyThread0 extends Thread {
    private StringBuffer stringBuffer;

    public MyThread0(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            stringBuffer.append("Java");
            System.out.println(stringBuffer.toString());
        }
    }
}

public class StringBufferThreadSafe {
    public static void main(String[] args) {
        StringBuffer sharedStringBuffer = new StringBuffer();
        MyThread thread1 = new MyThread(sharedStringBuffer);
        MyThread0 thread2 = new MyThread0(sharedStringBuffer);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Threads interrupted: " + e.getMessage());
        }
    }
}
/*
The `StringBuffer` class in Java is designed to be thread-safe. Each method in `StringBuffer` is synchronized, ensuring that operations on the same instance of `StringBuffer` are atomic and thread-safe. However, if you create separate instances of `StringBuffer` in each thread, you won't be able to demonstrate thread safety issues because each thread will be working on its own instance independently.

To demonstrate the thread safety of `StringBuffer`, you need to share the same instance between multiple threads. Here’s an example of how to do that:

### Correct Example

```java
package com.Java.MultiThreding.Universal;

class MyThread extends Thread {
    private StringBuffer stringBuffer;

    public MyThread(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            stringBuffer.append("Python");
            System.out.println(stringBuffer.toString());
        }
    }
}

class MyThread0 extends Thread {
    private StringBuffer stringBuffer;

    public MyThread0(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            stringBuffer.append("Java");
            System.out.println(stringBuffer.toString());
        }
    }
}

public class StringBufferThreadSafe {
    public static void main(String[] args) {
        StringBuffer sharedStringBuffer = new StringBuffer();
        MyThread thread1 = new MyThread(sharedStringBuffer);
        MyThread0 thread2 = new MyThread0(sharedStringBuffer);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Threads interrupted: " + e.getMessage());
        }
    }
}
```

### Explanation

1. **Shared StringBuffer**:
   - We create a single instance of `StringBuffer` (`sharedStringBuffer`) and pass it to both `MyThread` and `MyThread0`.

2. **Thread Execution**:
   - Both threads will append to the same `StringBuffer` instance. Due to the thread-safe nature of `StringBuffer`, the operations will be synchronized, ensuring that the output remains consistent without any corruption or interleaving issues.

3. **Join Threads**:
   - We use `join()` to ensure the main thread waits for both threads to complete their execution before continuing.

### Output

When you run the above code, you will notice that even though both threads are appending to the same `StringBuffer`, the operations are performed in a thread-safe manner, and the output remains consistent.

### Example Output

The exact output may vary due to thread scheduling, but you will see that the string in `sharedStringBuffer` grows consistently without any corrupted data.

```
Python
PythonJava
PythonJavaPython
PythonJavaPythonJava
PythonJavaPythonJavaPython
PythonJavaPythonJavaPythonJava
...
```

This demonstrates that `StringBuffer` is thread-safe and can be safely used across multiple threads without additional synchronization mechanisms.
* */