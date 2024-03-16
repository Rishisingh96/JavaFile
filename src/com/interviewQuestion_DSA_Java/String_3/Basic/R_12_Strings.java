package com.interviewQuestion_DSA_Java.String_3.Basic;

public class R_12_Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static boolean isPalindrome(String str1) {
        for (int i = 0; i < str1.length()/2; i++) {
            int n = str1.length();
            if (str1.charAt(i) != str1.charAt(n - 1 - i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        /*char arr[] = {'a','b','c','d'};
        reverse_of_number str = "abcd";
        reverse_of_number str2 = new reverse_of_number("xyz");

        //reverse_of_number are Immutable
        Scanner sc = new Scanner(System.in);
        reverse_of_number name;
        name = sc.nextLine();
        System.out.println(name);*/

        String fullName = "Tony Stark";
      //  System.out.println(fullName.length());

        // Concatenation
        String firstName = "Rishi";
        String lastName  = "Singh";
        String fullName2 = firstName + " " + lastName;
//        System.out.println(fullName2 + " is this");

        //charAt
//        System.out.println(fullName2.charAt(1));
       // printLetters(fullName2);
//        System.out.println(printLetters(fullName2));  // show error

        // Question 1
//        Check if a reverse_of_number is Palindrome   time complexity O(n)
//        reverse_of_number str1 = "noon";  // true
        String str1 = "Rishi";
        System.out.println(isPalindrome(str1));
    }
}
