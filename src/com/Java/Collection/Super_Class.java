package com.Java.Collection;

    /*/1> super is used to refer immediate parent class instance variable
    class Animal{
        reverse_of_number color = "white";
    }
        class Dog extends Animal{
        reverse_of_number color = "black";
        void printColor(){
            System.out.println(color);  // prints color of Dog class
            System.out.println(super.color); // print color of Animal class
            System.out.println(color); // print color of Animal class
        }
    }

     */


/*
//2> super is used to invoke parent class constructor
class Animal{
        Animal(){
            System.out.println("animal is created ");
        }
    }
class Dog extends Animal{
    Dog(){
        //new Animal();  // Call Animal but output print 2 times , Why ?
        super();
        System.out.println("dog is created ");
    }
}
*/
//3> super can be used to invoke parent class method
class Animal{
    void eat(){
        System.out.println("eating......");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating bread......... ");
    }
    void bark(){
        System.out.println("barking.........");
    }
    void work(){
        new eat();
        this.eat();
        eat();
        super.eat();
        bark();
    }
    private class eat {  // One Question that Why private Class only allow in Class.  //Error - ofter putting outside of class java: modifier private not allowed here
        eat() {             // What become a nested class ?
            System.out.println("Rishi singh");
        }
    }
}
//Error - ofter putting outside of class java: modifier private not allowed here

    public class Super_Class {
        public static void main(String[] args) {
/*
            Dog d = new Dog();
            d.printColor();
*/
//            Dog obj = new Dog();

            Dog x = new Dog();
            x.work();
        }
    }

