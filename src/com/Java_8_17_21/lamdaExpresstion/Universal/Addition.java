package com.Java_8_17_21.lamdaExpresstion.Universal;
@FunctionalInterface
interface Add
{
    void add(int a, int b );
}
class sum implements Add
{
    public void add (int a,int b){
    }
}
public class Addition {
    public static void main(String[] args) {
        //sum  obj = new sum();
        //	obj.add(43,5);

//        Add ob = (a,b)->System.out.println("Your sum is = " + (a+b));
//        ob.add(56,4);
//        int a= 10;
//        int b = 30;
//       (a,b)-> System.out.println("Your sum is = "+(a+b));
        Add add =  (a,b)-> System.out.println("Your sum is = "+(a+b));
        add.add(56,4);
    }
}
