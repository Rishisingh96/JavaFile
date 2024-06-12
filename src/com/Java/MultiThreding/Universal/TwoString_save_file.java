package com.Java.MultiThreding.Universal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

class MyThread3 extends Thread{
    public void run(){
        File file = new File("Rishi/Thread2.txt");
        try {
            if(file.exists()){
                System.out.println("Already exist");
            }
            else {
                file.createNewFile();
                System.out.println("File created.......");
            }
        } catch (IOException e) {
            System.out.println("File create fail......");
        }
        StringWriter sw = new StringWriter();
        for(int i=0; i>=5;i++) {
            sw.write("Hi , My name is Rishi");

       /* sw.write("1. What is Polymorphism in Java OOPs?\n" +
                "Ans: Polymorphism in java is one of the core concepts of object-oriented programming system. Polymorphism means “many forms” in Greek. That is one thing that can take many forms.\n" +
                "Polymorphism is a concept by which we can perform a single task in different ways. That is, when a single entity (object) behaves differently in different cases, it is called polymorphism.\n" +
                "In other words, if a single object shows multiple forms or multiple behaviors, it is called polymorphism.\n");*/
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(sw.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread4 extends Thread{
    public void run(){
        File file = new File("Rishi/Thread1.txt");
        try {
            if(file.exists()){
                System.out.println("Already exist");
            }
            else {
                file.createNewFile();
                System.out.println("File created.......");
            }
        } catch (IOException e) {
            System.out.println("File create fail......");
        }
        StringWriter sw = new StringWriter();
        for(int i=0; i>=5;i++) {
            sw.write("How are you.");

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(sw.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class TwoString_save_file {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3();
        MyThread4 thread2 = new MyThread4();
        thread1.start();
        thread2.start();

    }
}
