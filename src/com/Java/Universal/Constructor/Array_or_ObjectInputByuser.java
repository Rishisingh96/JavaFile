package com.Java.Universal.Constructor;

import java.util.Scanner;

class Product1 {
    int pcode;
    String pname;
    String ptype;
    float price;

    Product1(int pc, String pn, String pt, float pr) {
        pcode = pc;
        pname = pn;
        ptype = pt;
        price = pr;
    }

    void showProduct() {
        System.out.println(pcode + "  " + pname + "  " + ptype + "  " + price + "  ");
    }
}

public class Array_or_ObjectInputByuser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        Product1[] P = new Product1[2];

        for (i = 0; i < P.length; i++) {
            System.out.println("Enter your Product Code:");
            int pc = in.nextInt();

            // Consume the newline character left in the buffer
            in.nextLine();

            System.out.println("Enter your Product name:");
            String pn = in.nextLine();

            System.out.println("Enter your Product type:");
            String pt = in.nextLine();

            System.out.println("Enter your Product price:");
            float pr = in.nextFloat();

            P[i] = new Product1(pc, pn, pt, pr);
        }

        for (int j = 0; j < P.length; j++) {
            P[j].showProduct();
        }
    }
}
