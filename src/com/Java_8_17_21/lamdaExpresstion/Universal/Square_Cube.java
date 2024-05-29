package com.Java_8_17_21.lamdaExpresstion.Universal;


interface Square {
    int square(int r);
}

interface Cube {
    int cube(int q);

public class Square_Cube {
    public static void main(String[] args) {
        Square squareFunc = (r) -> r * r;
        Cube cubeFunc = (q) -> q * q * q;

        int res = squareFunc.square(5);
        int ans = cubeFunc.cube(5);

        System.out.println("Square: " + res);
        System.out.println("Cube: " + ans);
    }
}
}
