package com.Java.Universal.Week3;

import static com.Java.Universal.Week3.MathOperation.multiply;

/*3. Create a class MathOperation containing method multiply() to
calculate multiplication of following arguments :
1) two integer
2) three double values
3) all elements of array
4) one double and one integer*/
class MathOperation{
    static void multiply(int x, int y){
        int intmul = x * y;
        System.out.println("2 integer multiply = " +intmul);
    }
    static void multiply(double x,double y,double z){
        double doumul = (x*y*z);
        System.out.println("3 double multiply = " +doumul);
    }
    static void multiply(int arr[]){
        int mular = 1;
        for(int ele:arr){
            mular = mular * ele;
        }
        System.out.println("Array multiply = " +mular);
    }
    static void multiply(int x, double y){
//        double indo = x*y;
        int indo =(int)(x*y);
//        int indo = (int) ((double)x*y);  // forcefully casting explicit
        System.out.println("1 integer 1 double multiply = " +indo);
    }
}
public class R_3_MathOperation {
    public static void main(String[] args) {
        //   MathOperation mul = new MathOperation();
        multiply(60,40);
        multiply(20.45,40.56,34.56);
        int arr[] ={4,5,6};
        multiply(arr);
        multiply(60,40.90);
    }

}
