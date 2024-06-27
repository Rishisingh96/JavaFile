package com.Collection.Queue_Stack;

import java.util.ArrayList;

class Student{
    void show(){
        System.out.println("Hello Rishi");
    }

}
class Facalty{
    void Display(){
        System.out.println("Hello sir");
    }
}
public class Queue_Class {
    public static void main(String[] args) {
        Student student;
        Facalty facalty;
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(2.3);
        list.add(new Student());
        list.add(new Student());
        list.add(new Facalty());

        for (Object objects : list){
            System.out.println(objects);
        }
    }
}
