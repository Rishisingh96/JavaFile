package com.Java.InnerClass;

class OuterClass {
    // An instance method of class OuterClass.
    public void display() {
// Declaration of a method local inner class.
        class InnerClass {
            public void msg() {
                System.out.println("I am in Local inner class");
            }
        }
// Now, create an instance of a method local inner class and call the msg() method using object reference variable ic.
        InnerClass ic = new InnerClass();
        ic.msg();
    }
}

//Second Way
class Test1
{
    public void m1(){
// Method-local inner class starts here.
        class InnerClass {
            public void sum(int x, int y){
                System.out.println("Sum of two numbers: " +(x+y));
            }
        }
        InnerClass ic = new InnerClass();
        ic.sum(10, 20);
        ic.sum(20, 30);
        ic.sum(30, 40);
        ic.sum(40, 50);
    }

}
    public class Method_local_InnerClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.display(); // Call the display() method of OuterClass

        Test1 test1 = new Test1();
        test1.m1();
    }
}
