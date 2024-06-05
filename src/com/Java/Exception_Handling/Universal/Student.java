package com.Java.Exception_Handling.Universal;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        try {
            StudentMarks(m1, m2, m3);
        }catch (FailException e){
            e.show();
        }

    }

    private static void StudentMarks(int m1, int m2, int m3) throws FailException {
        int totalMarks = m1+m2+m3;
        float per = totalMarks*100/300;
        if(per>=33){
            System.out.println("You are Pass.......");
        }
        else {
            throw new FailException();
        }
    }
}
