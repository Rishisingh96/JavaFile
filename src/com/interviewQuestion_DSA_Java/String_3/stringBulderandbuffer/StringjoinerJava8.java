package com.interviewQuestion_DSA_Java.String_3.stringBulderandbuffer;
import java.util.StringJoiner;
public class StringjoinerJava8 {
    public static void main(String[] args)
    {
        StringJoiner strJoiner = new StringJoiner(",", "[", "]");
        strJoiner.add("Red");
        strJoiner.add("Green");
        strJoiner.add("Blue");
        System.out.println(strJoiner);
    }
}

