package com.Java.Universal.Week3;

/*
Create a class Tile to store the edge length of a square tile and create
another class Floor to store length and width of a rectangular floor. Add
method totalTiles(Tile t) in Floor class with Tile as argument to clculate
the whole number of tiles needed to cover the floor completely.
*/
class Tile{
    int  edge_length_square(int s){
        int square = s*s;
    return square;
    }
}
class Floor extends Tile{
    int Floor(int length,int width){
        int CFloor = length*width;

        return CFloor;
    }
}


public class R_1_TotalTail_floor {
    public static void main(String[] args) {

        Floor tf = new Floor();
        tf.Floor(12,12);
        tf.edge_length_square(5);
        System.out.println((tf.Floor(12,12))-(tf.edge_length_square(5)));

    }
}
