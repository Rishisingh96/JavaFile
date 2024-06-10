package com.Test;

class Tile4{
    int  edge_length_square(int s){
        int square = s*s;
        return square;
    }
}
class Floor4 extends Tile4 {
    int Floor4(int length,int width){
        int CFloor = length*width;
        return CFloor;
    }
}
public class TotalTail_floor {
    public static void main(String[] args) {

        Floor4 tf = new Floor4();
        double floor =  tf.Floor4(20,15);
        double tile = tf.edge_length_square(4);
//        System.out.println(Math.ceil(floar/tile));
        System.out.println((int) Math.ceil((double) floor/tile));

    }
}
