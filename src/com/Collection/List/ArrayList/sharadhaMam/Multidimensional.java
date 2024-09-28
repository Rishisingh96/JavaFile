package com.Collection.List.ArrayList.sharadhaMam;

import com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray.Jagged_Array;

import java.util.ArrayList;

public class Multidimensional {
    public static void main(String[] args) {
       /* ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for (int j=0; j<currList.size(); j++){
                System.out.print(STR."\{currList.get(j)} ");
            }
            System.out.println();
        }
        System.out.println(mainList);*/

        //Question
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> lis1 = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();
        ArrayList<Integer> lis3 = new ArrayList<>();
//        lis2.remove(3);
//        lis2.remove(2);
        for (int i=1; i<=5; i++){
            lis1.add(i*1); // 1 2 3 4 5
            lis2.add(i*2); //2 4 6  8 10
            lis3.add(i*3); //3 6 9 12
        }
        mainList2.add(lis1);
        mainList2.add(lis2);
        mainList2.add(lis3);

        System.out.println(mainList2);

        //nested loops
       for (int i = 0 ; i<mainList2.size(); i++){
            ArrayList<Integer> currList = mainList2.get(i);
            for (int j=0 ; j<currList.size(); j++){
                System.out.print(STR."\{currList.get(j)} ");
            }
            System.out.println();
      }
    }
}
