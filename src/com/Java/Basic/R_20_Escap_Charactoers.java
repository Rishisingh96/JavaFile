package com.Java.Basic;

public class R_20_Escap_Charactoers {
    public static void main(String[] args) {
       // System.out.println("He said, "I believe that the Earth is Flat".");
        // /*As we can see that the code gives an error. This is because the compiler assumes that the string ends after the 2nd quotation mark.
        //This can be solved by using ‘\’ (backslash). Backslash acts as an escape character allowing us to use quotation marks in strings.*/error

        System.out.println("He said, \"I believe that the Earth is Flat\".");
        System.out.println("she said, \'But the Earth is spherical\'.");
        System.out.println("She said, \"Rishi is good boy\".");
//=========================================================================
//        System.out.println("This path is D:\Docs\Java\String");  //illegal escape character
        System.out.println("This path is D:\\Docs\\Java\\String");

        //====================================================================
        System.out.println("My name is Antony\nI'm an Artist");
        System.out.println("age: \t18");
        System.out.println("Address: Washington Dc");
        System.out.println("Address\b: Washington Dc");

    }
}
