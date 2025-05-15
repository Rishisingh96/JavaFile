package com.interviewQuestion_DSA_Java.Heap_18;

import java.util.ArrayList;

public class InsertData {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            // add at last idx
            arr.add(data);
            int x = arr.size() - 1; // x is child index
            int parent = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(parent)){
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

//                // update x and parent
//                x = parent;
//                parent = (x - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {

    }
}
