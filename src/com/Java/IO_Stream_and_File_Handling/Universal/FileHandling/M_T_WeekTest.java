
package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;
public class M_T_WeekTest {
    public static void main(String args[]) throws InterruptedException {
        // TODO code application logic here
        
        Thread f = new Thread();
        
        f.start();
        System.out.println("A");
        f.wait(1000);
        System.err.println("B");
    }
}
