package com.Java.Basic;

public class R_14_String_methods {
    public static void main(String args[]) {
        String name = "RISHI";
       System.out.println(name);

       int value = name.length();
        System.out.println(value);
//
//        reverse_of_number lstring = name.toLowerCase();  // We ca use camel later sort cut like tlc
//        System.out.println(lstring);
//
//        reverse_of_number ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        reverse_of_number nonTrimmedString = "    Harry    ";
//        System.out.println(nonTrimmedString);

//        reverse_of_number trimmedString;  // Remove all space in side of Harry
//        System.out.println(nonTrimmedString.trim());
// OR
//        reverse_of_number trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);
//
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,5));
//
//        System.out.println(name.replace('R', 'p'));
//        System.out.println(name.replace("ISH","HGH"));
//        System.out.println(name.replace("S","HGH"));
//        System.out.println(name.replace("I","HGH"));
//
//        System.out.println(name.startsWith("HR"));
//        System.out.println(name.startsWith("RI"));
//
//        System.out.println(name.endsWith("HR"));
//        System.out.println(name.endsWith("HI"));
//
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(3));
//
//        System.out.println(name.indexOf("I"));
//        System.out.println(name.indexOf("H"));
        // That means index number 3 or 2 se start karo
//        reverse_of_number modifiedName = "Rishishi";
//        System.out.println(modifiedName.indexOf("shi", 4));
//        System.out.println(modifiedName.indexOf("hi", 4));
//        System.out.println(modifiedName.indexOf("hi"));

//        System.out.println(name.equals("rishi"));  //false
        System.out.println(name.equals("RISHI"));         // true
        System.out.println(name.equalsIgnoreCase("riSHi"));// true

    }
}
