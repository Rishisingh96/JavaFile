package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

public class StringPattern {
    public static void main(String[] args) {
        String st[][] ={
                {"MCA" ,"C", "C++","Java","Python"},
                {"BCA","C","Java"},
                {"MSC","C++","Java","Python"}
        };
        for(String matrix[]:st){
            for(String row:matrix){
                System.out.print(row +" ");
            }
            System.out.println(" ");
        }
    }
}
