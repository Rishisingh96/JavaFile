package com.Java.Inheritance_Inferface.Universal.Interface;
class Demo{
    void Bye(){
        System.out.println("Bye Bye");
    }
}
interface interf1
{
    void print();
}
interface interf2
{
    void Display();
}
class Show extends Demo implements interf1,interf2{
    @Override
    public void print(){
        System.out.println("printing........");
    }

    @Override
    public void Display() {
        System.out.println("Displaying..........");
    }
}
public class Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Show show = new Show();
        show.Display();
        show.print();
        show.Bye();
    }
}
