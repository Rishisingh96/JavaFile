package com.interviewQuestion_DSA_Java.String_3.All_method;

public class split_Method {
    public static void main(String[] args) {

        //Example 1: Splitting by Space
        String str = "This is an example string";
        String[] words = str.split(" ");
//// words = ["This", "is", "an", "example", "string"]
        for (String word : words) {
            System.out.println(word);
        }
//Example 2: Splitting by Comma
        String str1 = "apple,banana,cherry";
        String[] fruits = str1.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//// fruits = ["apple", "banana", "cherry"]


        //Example 3: Splitting with a Limit
        String str3 = "one,two,three,four";
        String[] parts = str3.split(",", 2);
//// parts = ["one", "two,three,four"]  //Here, the limit of 2 means that the string is split into at most two parts.

        for (String part : parts) {
            System.out.println(part);
        }

        //Example 4: Using a Regular Expression to Split by Digits
        String str4 = "one1two2three3four";
        String[] parts4 = str4.split("\\d"); // Split by any digit

        for (String part : parts4) {
            System.out.println(part);
        }
//// parts = ["one", "two", "three", "four"]

        //Example 5: Handling Empty Strings
        String str5 = "apple,,banana";
        String[] fruits5 = str5.split(",");

        for (String fruit : fruits5) {
            System.out.println("[" + fruit + "]");
        }
//[apple]
//[]
//[banana]


//Example 6: Splitting by Multiple Delimiters
        String str6 = "one;two,three four";
        String[] parts6 = str6.split("[,; ]"); // Split by comma, semicolon, or space

        for (String part : parts6) {
            System.out.println(part);
        }
        //one
        //two
        //three
        //four
    }
}
