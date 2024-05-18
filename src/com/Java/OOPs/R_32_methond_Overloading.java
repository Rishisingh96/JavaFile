package com.Java.OOPs;

public class R_32_methond_Overloading {
    static void foo(){
        System.out.println("Good Morning bro !");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void change(int a){    // a is  parameter
        a = 488;
    }
    static void change2(int [] arr){
        arr[0] = 99;
    }
    static void telljokes(int [] arr){
        arr[0] = 50;
    System.out.println("I invented a new word !\n" +
            "Plagiarism!");

}
public static void main(String args[]){

/*/ case 1 : Changing the Integer
    int x = 45;
    change(x);
    System.out.println("The value of x ofter running change is :" +x);
  */

    /*/ case 1: Changing the Array
    int [] marks = {53,73,77,89,98,84};
    change2(marks);
    System.out.println("The value of x ofter running change is :" + marks[0]);
*/

//    case 3 :Method Overloading
    foo();
    foo(3000);  // arguments are actual !
   // foo(3000 4000 );  // arguments are actual !
}
}
