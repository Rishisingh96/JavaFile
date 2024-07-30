package com.Java.Universal.Advance_Java;
import java.util.*;
public class R1_ArrayList2 {
    /*
1) Write a java program to create ArrayList of any type and perform following operations :
1) Add elements to arraylist and print them using for-each loop
2) Add elements to arraylist and print them using Iterator
3) Ask for position and new element from user , check if the position is valid and then
insert the user entered element at that position
4) Ask for position from user and then retrieve the element at that position , proper
error message should be displayed if the position is invalid.
5) Ask for position from user and then delete the element at that position , proper
error message should be displayed if the position is invalid.
6) Ask for position from user and the new element and then replace the element at
that position , proper error message should be displayed if the position is invalid.
7) Ask for element from user and then delete that element from the arraylist , proper
error message should be displayed if the element is not present in the list.
8) Convert the arraylist into an array
*/
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList();
        ar.add(23);
        ar.add(50);
        ar.add(30);
        ar.add(20);
        ar.add(23);
        ar.add(34);

        //Using for-each loop
//        int count = 0 ;
//        for(int add : ar){
//            System.out.println(add);
//            count = count +add;
//        }
//        System.out.println(STR."Your sum of element \{count}");
//
//        //using iterator
//        ListIterator<Integer> iterator = ar.listIterator();
//        iterator.add(10);
//        while (iterator.hasNext()){
//            Integer value = iterator.next();
//            iterator.add(99);
//            break;
//        }
//        System.out.println("ArrayList after adding elements:"+ar);

        //3.Ask for position and new element from user , check if the position is valid and then
        //insert the user entered element at that position
        System.out.println("Enter your position of number : ");

        int n = p.nextInt();
        try {
            if (n >= 0) {
                ar.add(n, 60);
            } else {
                System.out.println("invalid number");
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" your number is out of index");
            e.printStackTrace();
        }
        System.out.println(ar);

        /*4) Ask for position from user and then retrieve the element at that position , proper
error message should be displayed if the position is invalid.*/
        try {
            System.out.println("Enter your position under 6");
            int n1 = p.nextInt();
            Object s = ar.get(n1);
            System.out.println(s);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index n1 out of bounds for length 6");
        }

        /*5) Ask for position from user and then delete the element at that position , proper
error message should be displayed if the position is invalid.*/
        try {
            System.out.println("Enter your position under 6");
            int n1 = p.nextInt();
            System.out.println(STR."Before removing:\{ar}");
            System.out.println(ar.remove(n1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index n1 out of bounds for length 6");
        }
        System.out.println(ar);

        /*6) Ask for position from user and the new element and then replace the element at
that position , proper error message should be displayed if the position is invalid.*/
//        try {
//            System.out.println("Enter your position Which you want to modifying under 6");
//            int n1 = p.nextInt();
//            System.out.println(STR."Before modifying :\{ar}");
//            System.out.println(ar.set(1,40));
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("Index n1 out of bounds for length 6");
//        }
//        System.out.println(STR."After modifying :\{ar}");

        /*7) Ask for element from user and then delete that element from the arraylist , proper
error message should be displayed if the element is not present in the list.*/
         /*try {
            System.out.println("Enter your position under 6");
            int n1 = p.nextInt();
            System.out.println(STR."Before removing:\{ar}");
            System.out.println(ar.remove(n1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index n1 out of bounds for length 6");
        }
        System.out.println(STR."After deleting :\{ar}");*/

        /*8) Convert the arraylist into an array*/
       /* Integer[] array = new Integer[ar.size()];
        array = ar.toArray(array);

        for (Integer num : array){
            System.out.println(num +" ");
        }*/
    }
}
