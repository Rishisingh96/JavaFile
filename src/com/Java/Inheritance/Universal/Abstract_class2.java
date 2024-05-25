package com.Java.Inheritance.Universal;

abstract class Animal4{
    void eat(){
        System.out.println("Eating..........");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    abstract void movement();
}
class Cat4 extends Animal4{
    @Override
    void movement(){
        System.out.println("Jumping...........");
    }
}
class Fish extends Animal4{
   @Override
    void movement(){
        System.out.println("Swing..........");
    }
}
public class Abstract_class2 {
    public static  void main(String[] args) {

        Cat4 cat = new Cat4();
        cat.movement();
        cat.sleep();
        cat.eat();

        System.out.println("++++++++++++++++++++++");
        Fish fish = new Fish();
        fish.movement();
        fish.sleep();
        fish.eat();
    }
}
