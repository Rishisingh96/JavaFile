package com.company;

public class R_32_callbyValueExample {
    //Program code 1:
        /*int change ( int b)
        {
            ++b; // Changes will be in the local variable only.
            return b;
        }*/

    //Program code 2:
    int x = 20;
    void modify(int x) {
        x = x + 200;
        System.out.println("Value of x after modification: " + x);
    }
        public static void main (String[]args)
        {
            // Create an object of class.
           /* R_32_callbyValueExample obj = new R_32_callbyValueExample();
            int a = 20;
            int x = obj.change(a);

            System.out.println("Value of a after passing: " + a);
            System.out.println("Value of x after modifying: " + x);*/


            //=======================
            R_32_callbyValueExample  t = new R_32_callbyValueExample ();
            t.modify(t.x);
            System.out.println("Original value of x: " +t.x);

        }
}

