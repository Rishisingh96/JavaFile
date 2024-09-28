package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class Reverses_String {

    //using  StringBuilder
    public static String reverse(String h){
        StringBuilder ReverseC = new StringBuilder(h);
        return ReverseC.reverse().toString();
    }

    //using
    public static void reverse2(){
        String st = "Rishi singh is a Hero";
        String rev = "";
        for(int i = st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }
        System.out.println(STR."Reverse Name : \{rev}");
    }
    public static void reverse3(){
        String s[] = "Rishi singh is a Hero".split(" ");
        String ans = "";
        for(int i = s.length-1; i>=0; i--){
            ans = ans+s[i]+" ";
        }
//        System.out.println(ans.substring(0,ans.length()-1));
        System.out.println(ans);
    }
    // Function to reverse a given string
    // Function to reverse the order of words in the string
    // Function to reverse each word in the string while preserving word order
    public static String reverseEachWord(String input) {
        String[] words = input.split(" ");  // Split the string by spaces
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reversedString.append(sb.reverse().toString()).append(" ");
        }

        return reversedString.toString().trim();  // Remove the trailing space
    }
    public static void main(String[] args) {

        System.out.println(reverse("Hello Rishi"));
        System.out.println("\n--------------------------------------------\n");
        reverse2();
        System.out.println("\n--------------------------------------------\n");
        reverse3();

        System.out.println("\n--------------------------------------------\n");
        String original = "Rishi singh";

        // Calling the reverse function
        String reversed = reverseEachWord(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
