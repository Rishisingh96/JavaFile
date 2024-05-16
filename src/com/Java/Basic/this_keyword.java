package com.Java.Basic;

public class this_keyword {

    //1> Referring to the instance Variable of the Current Class

    /*When the parameters to a method and instance variables in a class are the same, we can use 'this' keyword to differentiate between them*/
    //public class ThisKeywordExample{
    /*
    int a;
    int b;
    //Parameterize constructor
    this_keyword(int a,int b){
        this.a = a;
        this.b = b;

    }
    void show(){
        System.out.println("a = "+a+"b="+b);
    }



//2> Invoking the Method of the Current Class

        public void show (){
            // Calling function print() using 'this' keyword
        this.print();
            System.out.println("Inside the show() function");
        }
        public void print(){
            System.out.println("Inside the print() function");
        }

     */
        //3> Invoking the Constructor of the Current Class
        int a ;
        int b;
        // Default Constructor
            this_keyword(){
                this(10, 20);
                System.out.println("Inside this Default Constructor ");
            }
            // Parameterized constructor
    this_keyword(int a,int b){
                this.a = a;
                this.b = b;
        System.out.println("Inside the Parameterized Constructor");
    }

        public static void main(String[] args) {
            //this_keyword obj = new this_keyword(10,20);

            /*this_keyword obj = new this_keyword();
            obj.show();
             */

            this_keyword obj = new this_keyword();
    }
}
