package com.interviewQuestion_DSA_Java.String_3.leetCode.sortName;

public class Sort_Name_me {
    public static void main(String[] args) {
        String string = "Rishi singh";
        //System.out.print(string.charAt(0) + " ");
        //System.out.print(string.substring(string.indexOf(" ") + 1));

        String str = "Rishi singh kumar";
        for (int i = 0; i < str.indexOf(" "); i++) {
          //  System.out.print(str.charAt(i)+"");
        }
        System.out.println(" "); // To move to the next line after printing the first name

        String str2 = "Rishi singh kumar";
        String sp[] = str2.split(" ");

        System.out.print(string.substring(string.indexOf(" ")));

    }
}
