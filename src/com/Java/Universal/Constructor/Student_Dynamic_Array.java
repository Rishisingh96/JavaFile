package com.Java.Universal.Constructor;


import javax.xml.namespace.QName;
import java.util.Scanner;

class Student1{
    String name;
    int roll_n;
    float marks;
    Student1(String nm,int r_n, float mk){
       name = nm;
       roll_n = r_n;
       marks = mk;
    }
    void show(){
        System.out.println("Name is : "+ name + "\nRoll no : " + roll_n +"\nMarks : "+ marks);
    }

}
public class Student_Dynamic_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        Student1 P[] = new Student1[3];
        while (i>P.length){
            System.out.println("Enter your name ");
            String name = in.nextLine();
            System.out.println("Enter your roll number");
            int roll_n = in.nextInt();
            System.out.println("Enter your marks ");
            float marks = in.nextFloat();
            new Student1(name,roll_n,marks);
            i++;
        }


    }
}
