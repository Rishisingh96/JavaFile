package com.Java.loop.InfiniteLoop;


/*1. The for loop can have more than one initialization expression and iteration expression. This feature cannot apply in other loops. Each expression must be separated from the next by a comma. Let’s take one more example program based on this point.*/

public class SeparatedByNextComma {
    public static void main(String[] args) {
        int x, y;
        for(x = 1, y = 5; x<y; x++, y--) {
//            System.out.println("x = " + x + "\t" + "y = " + y);
            System.out.println("x= " + x);
            System.out.println("y= " + y);
        }
    }
}
