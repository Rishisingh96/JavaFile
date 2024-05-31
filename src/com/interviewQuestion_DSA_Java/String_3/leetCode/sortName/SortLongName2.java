package com.interviewQuestion_DSA_Java.String_3.leetCode.sortName;

import java.util.Scanner;

public class SortLongName2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = in.nextLine();
        int i, j = 0;
        char c, d;

        i = str.length() - 1;
        while (str.charAt(i) != ' ') {
            i--;
        }

        while (j < i) {
            if (j == 0) {
                System.out.print(str.charAt(j) + " ");
            } else {
                c = str.charAt(j);
                d = str.charAt(j + 1);
                if (c == ' ' && d != ' ') {
                    System.out.print(d + " ");
                }
            }
            j++;
        }

        System.out.print(str.substring(i));
    }
}
