package com.Java.Universal.Constructor;

import java.util.Scanner;

class Product{
    int pcode;
    String pname;
    String ptype;
    float price;
    Product (int pc, String pn, String pt, float pr){
        pcode = pc;
        pname = pn;
        ptype = pt;
        price = pr;
    }
void showProduct(){
    System.out.println(pcode +"  "+ pname +"  "+ ptype +"  "+ price +"  ");
}
void add(){
        int sum=0,i=0;
    System.out.println(price);
    sum = (int) (sum + price);
    System.out.println(sum);
}
}
public class ArrayOF_Object {
    public static void main(String[] args) {
    int i;
    Product1[] P = new Product1[3];
    // 1st Way take input
    P[0] = new Product1(10,"Computer","elex",75000);
    P[1] = new Product1(20,"Laptop","elex",50000);
    P[2] = new Product1(30,"WashiMachine","elec",9000);

//    P[0].showProduct();
//    P[1].showProduct();
//    P[2].showProduct();
    //or
        /*for(i=0;i<P.length; i++){
            if(P[i].ptype == "elex"){
                P[i].showProduct();
            }
        }*/
       /* for(i=0;i<P.length; i++){
            if(P[i].price<70000){
                P[i].add();
            }
        }*/
        int sum =0;
        for(i=0;i<P.length; i++){
            float price = P[i].price;
            System.out.println(price);
            sum += P[i].price;
        }
        System.out.println("Your total price is "+sum);
        //2nd Way
        Scanner in = new Scanner(System.in);
        // second Way to take input
//        for(i=0; i<P.length; i++){
//            System.out.println("Enter your first Product :");
//        }
    }
}
