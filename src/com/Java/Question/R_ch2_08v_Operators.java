package com.Java.Question;

public class R_ch2_08v_Operators {
    public static void main(String[] args){

/*/        1.Arithmetic Operators
        int a = 4;
         int b = 6 +a;
        // int b = 6%a;   // Modulo Operator
        System.out.println(b);
        // 4.8%1.1 --> Returns Decimal Remainder

//       2. Assignment Operators
        int c = 9;
        c *=3;
        System.out.println(c);

        // 3.Comparison Operators
         System.out.println(64<6);

        // 4.Logical Operators
         System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5.Bitwise Operators
        System.out.println(2&3);
//        10
//        11
//       ----
//        10
*/
        /*/ Comparison Operators Find The Greatest number
        System.out.println("Enter your number :");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
//        System.out.println(a);
//        System.out.println(b);

        if(a>b){
            System.out.println(" \t\ta is greatest \n\n");
        }
        else{
            System.out.println("\t\t b number is Greatest\n\n");
        }
*/
        // Ternary Operators   find the Greatest Number in two number
        int x = 3;
        int y = 4;
        int k = x>y?x:y;
       System.out.println("Greatest number is "+k);
//            System.out.println("Greatest number is "-k);

    }
}
