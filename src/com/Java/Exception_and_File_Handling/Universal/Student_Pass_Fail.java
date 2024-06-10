package com.Java.Exception_and_File_Handling.Universal;

import java.util.Scanner;

class StudentP {
    int Physics;
    int Math;
    int English;
    int Hindi;
    int Chemistry;

    public StudentP(int physics, int math, int english, int hindi, int chemistry) {
        Physics = physics;
        Math = math;
        English = english;
        Hindi = hindi;
        Chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "StudentP{" +
                "Physics=" + Physics +
                ", Math=" + Math +
                ", English=" + English +
                ", Hindi=" + Hindi +
                ", Chemistry=" + Chemistry +
                '}';
    }

    public boolean isPass() {
        return Physics >= 33 && Math >= 33 && English >= 33 && Hindi >= 33 && Chemistry >= 33;
    }

    public double getPercentage() {
        return (Physics + Math + English + Hindi + Chemistry) / 5.0;
    }
}

public class Student_Pass_Fail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentP[] students = new StudentP[2];
        students[0] = new StudentP(30, 60, 70, 23, 80);
        students[1] = new StudentP(50, 60, 70, 40, 80);

        for (StudentP student : students) {
            System.out.println(student);

            if (student.Chemistry >= 33) {
                System.out.println("You are Pass in Chemistry........"+ student.Chemistry+"%");
            } else {
                System.out.println("You are Fail in Chemistry........");
            }

            if (student.Physics >= 33) {
                System.out.println("You are Pass in Physics........");
            } else {
                System.out.println("You are Fail in Physics........");
            }

            if (student.Math >= 33) {
                System.out.println("You are Pass in Math........");
            } else {
                System.out.println("You are Fail in Math........");
            }

            if (student.Hindi >= 33) {
                System.out.println("You are Pass in Hindi........");
            } else {
                System.out.println("You are Fail in Hindi........");
            }

            if (student.English >= 33) {
                System.out.println("You are Pass in English........");
            } else {
                System.out.println("You are Fail in English........");
            }

            double percentage = student.getPercentage();
            System.out.println("Your percentage is: " + percentage + "%");
            System.out.println("------------------------");
        }
    }
}
