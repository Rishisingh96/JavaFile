package com.Java.OOPs;

public class R_31_2ndmathod {
    //++++++++++++++++++++++++++++++++++++
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 3434;  // No problem no effect
        return z;
    }

    public int max(int x , int y){
        //User defined Method
        System.out.println("Max number is "+ Math.max(x,y));
        return 0;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++

    public static void main(int a)
    {
        System.out.println("Second main() method");
        main();
    }
    public static void main()
    {
        System.out.println("Third main method");
    }

    public static void main(String[] args) {
//        int a = 4;
//        int b = 8;
//        int c;
        R_31_2ndmathod obj = new R_31_2ndmathod();
//        c = obj.logic(a,b);
        System.out.println(obj.logic(4,8));


        int a1 = 4;
        int b1 = 2;
        int d = obj.logic(a1, b1);

//        System.out.println(c);
      //  System.out.println(d);

      //  obj.max(5,7);

        main(20);

    }
}