
package com.Java.Exception_Handling.Universal;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;
public class File_Lock {
    public static void main(String args[]) {
        // TODO code application logic here
        RandomAccessFile file = null;
        FileChannel channel = null;
        FileLock lock = null;

        try {
            file = new RandomAccessFile("example.txt", "rw");
            channel = file.getChannel();
            
            // Acquire an exclusive lock on the file
            lock = channel.lock();
            
            // Do operations on the locked file
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (lock != null) {
                    lock.release(); // Release the lock
                }
                if (channel != null) {
                    channel.close(); // Close the channel
                }
                if (file != null) {
                    file.close(); // Close the file
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
