package com.Java.Universal.Test;

class Tile{
    int  edge_length_square(int s){
        int square = s*s;
        return square;
    }
}
class Floor extends Tile {
    int width;
    int height;

    public Floor(int width, int height) {
        this.width = width;
        this.height = height;
    }


}
public class R_1_TotalTail_floor {
    public static void main(String[] args) {

        Floor tf = new Floor(20,15);

//        System.out.println(Math.ceil(floar/tile));
        //System.out.println((int) Math.ceil((double) floor/tile));

    }
}
