package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.ArrayList;
import java.util.Stack;

public class StackUseCollectionF {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
