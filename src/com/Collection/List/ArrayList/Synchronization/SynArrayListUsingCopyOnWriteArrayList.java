package com.Collection.List.ArrayList.Synchronization;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class SynArrayListUsingCopyOnWriteArrayList {
    public static void main(String[] args)
    {
        // Create a thread-safe ArrayList.
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
        al.add("Pen");
        al.add("Pencil");
        al.add("Copy");
        al.add("Eraser");
        al.add("Shapner");
        System.out.println("Displaying synchronized ArrayList ");
        // Synchronized block is not required in this method.
        for (String str : al) {
            System.out.println(str);
        }
    }
}
