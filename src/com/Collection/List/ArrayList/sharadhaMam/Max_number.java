package com.Collection.List.ArrayList.sharadhaMam;

import java.util.ArrayList;

public class Max_number {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(10);
        lis.add(3);  //O(1)
        lis.add(5);
        lis.add(34);
        lis.add(54);

//        System.out.println(lis.get(Integer.MIN_VALUE));
        int max = Integer.MIN_VALUE;
        for (int i=0; i<lis.size(); i++){
            /*if(max < lis.get(i)){
                max = lis.get(i);
            }*/
//            or
            max = Math.max(max,lis.get(i));
        }
        System.out.println(max);

        //swap two number

        int x = lis.get(2);
        int y = lis.get(3);
        int temp = x;
        x =y;
        y = temp;
        System.out.println(STR."x =\{x} y =\{y}");
    }
}
