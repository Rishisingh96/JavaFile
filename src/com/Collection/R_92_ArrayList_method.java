package com.Collection;

import java.util.ArrayList;

public class R_92_ArrayList_method {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(19);
        l2.add(14);
        l2.add(15);

        l1.add(8);
        l1.add(3);
        l1.add(2);
        l1.add(5);
        l1.add(2);
   //     l1.add(0,5);
    //    l1.add(0,1);
        l1.add(9);

       // l1.addAll(l2);
        l1.addAll(0,l2);
        l1.clear();
        for (int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
