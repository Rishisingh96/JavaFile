package com.company;
abstract class Parent2{
//    public parent2(){   //invalid method declaration; return type required
         public Parent2(){
        System.out.println("Mai base2 ka constructor hoo");
         }
        public void sayHellow(){
            System.out.println("Hellow....");
        }
        abstract public void greet();
        abstract public void greet2();
        }

class child2 extends Parent2{
    public void greet(){
        System.out.println("Good Morning....");
    }
    public void greet2(){
        System.out.println("Good afternoon........");
    }
}

abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good......");
    }
}
public class R_53_abstract_class {
    public static void main(String arg[]){
//        Parent2 p = new Parent2(); // we can not create object because he is abstreact class
        child2 C = new child2();
        C.greet();
        C.sayHellow();
//        C.child3();     error
//        child3 C3 = new child3();
    }

    //
}
