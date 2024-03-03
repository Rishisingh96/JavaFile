package com.Java.Basic;

public class R_10_resulting_data_type {
    public static void main(String[] args){
        /*
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f +x;
        System.out.println(b);
        System.out.println(a);
*/
        /*/ Increment and Decrement Operators
        int i  = 56;
        // int b = i++;  // first b is assigned i (56) then i is incremented
//        int j = 67;
//        int c = ++j;  // first j is incremented then c is assigned j (68)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);  //58 print and than increment
        System.out.println(++i);   // value find when increment i++ = i = 59 and ++i fist increment 60
        System.out.println(i);     // i = 60 print

         */

        /*/ Quick Quiz 1 - Try increment and decrement operators on a Java variable
        int a = 50;
        System.out.println(a++); // first a is assigned a (50) then a is incremented 51
        System.out.println(++a);  // a(51) is incremented then c is assigned j (52)
*/

        /*/ Quick Quiz 2 - What will be the value of the following expression(x)
        int y = 7;
        int x = y++ * 8;  // 7*8 = 56
        int n = y *8;      // 8 * 8 = 64
        System.out.println(x);
        System.out.println(n);
*/
        int y1 = 7;
        int z = ++y1 *8;  //out 7+1=8 , z=8*8= 56
        System.out.println(z);

/*

        int y1 = 7;      // When only print y1 = 7 than y1 = 7 but if next print y1 =8
        int y2 = ++y1 *8;  // y2 = 7+1 = 8 ,8*8 = 64 if only print y2 than 64 but when print next increment value than 64+1 = 65
        int x = y2++ * 8;  // y2 = 64 , 64*8= 512
        int n = y2 *8;      // 64+1 = 65*8 = 520
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(x);
        System.out.println(n);

        char ch = 'a';
        System.out.println(++ch);
        System.out.println(--ch);
       */
    }
}
