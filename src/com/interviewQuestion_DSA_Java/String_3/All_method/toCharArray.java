package com.interviewQuestion_DSA_Java.String_3.All_method;

public class toCharArray {
    public static void main(String[] args) {
        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i] +" ");
        }
        System.out.println(s1);

        //Basic use
        String str = "Hello World";
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            System.out.println(c);
        }

        //Example 1 - Counting Specific Characters
        String str2 = "Rishi singh";
        char[] charArray1 = str2.toCharArray();
        int count = 0;

        for(char c : charArray1){
            if(c == 'i'){
                count++;
            }
        }
        System.out.println("The letter 'i' appears " + count + " times.");

        //Example 2: Reversing a String
        String str3 = "Hello World";
        char[] charArray3 = str3.toCharArray();
        int start = 0;
        int end = charArray3.length - 1;

        while (start < end) {
            char temp = charArray3[start];
            charArray3[start] = charArray3[end];
            charArray3[end] = temp;
            start++;
            end--;
        }

        String reversedStr = new String(charArray3);
        System.out.println("\nReversed String: " + reversedStr);

        char[] charArray4 = {'J', 'a', 'v', 'a'};
        String str4 = new String(charArray4);
        System.out.println("\nString:"+str4);
    }
}
