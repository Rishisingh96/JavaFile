package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1.Oprator;

public class increment_and_Decrement {
    public static void decrement(int x){
        int y,z;  //x=4
        y = --x;  //x=3
        z = x--;   //x=3 ofter run x = 2
        System.out.println("x="+ x + "\ty=" + y + "\tz="+z);
        //Rry run-
        // x = 4;

    }
    public static void incrementDecrement(int x){


    }

    public static void main(String[] args) {
        int a = 3;
        System.out.printf("%d\t%d\t%d\t", a, ++a, a++); // Output: "354"

//        int a = 3;
//        System.out.println(a + " " + ++a + " " + a++);

//        decrement(x);
       // incrementDecrement(x);
    }
}
