package com.Collection.List.ArrayList.sharadhaMam;
import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
//        String | Boolean
//    Classroom objectName = new Classroom();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String > list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
       //add
        list.add(1);
        list.add(3);  //O(1)
        list.add(5);
        list.add(34);
        System.out.println(list);

        //get
        //list.get(2);  //O(1)
        int element = list.get(3);
        System.out.println(element);

        //Delete  ----/  O(n)
        list.remove(3);
        System.out.println(list);

//        Set Element at index
        list.set(2, 342);
        System.out.println(list);

        //Contains Element check element is present of not true and false --/
        System.out.println( list.contains(1));  // O(n)
        System.out.println( list.contains(4));

        //add postion value   -/ O(n)
        list.add(1,9);

        System.out.println("///////////////////");
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // Print Reverse Arraylist
        System.out.println("Reverse");
        ArrayList<Integer> lis = new ArrayList<>();

        //add
        lis.add(1);
        lis.add(3);  //O(1)
        lis.add(5);
        lis.add(34);


        for (int i=lis.size()-1; i>0; i--){  //O(n)
            System.out.print(lis.get(i) +" ");
        }
    }
}
