package com.company;

//final public class R_38_Type_class {
public class R_38_Type_class {
//    Types of Classes in Java | We know Java is one of the most popular programming languages that provides a robust object-oriented programming (OOP) model.
//  ++++++++++++++++++  1. Concrete Class:
  /*  int a;
    int b;
    R_38_Type_class()
{
 a = 50;
 b = 50;
}
void display()
{
 int sum = a + b;
 System.out.println("Sum of two numbers: " +sum );
}
public static void main(String[] args) {
    R_38_Type_class c = new R_38_Type_class();
 c.display();
 }*/

//   +++++++++++++++++ 2. Static Class:

// Static nested class starts here.
 /*static class B // Inner class with the static modifier
 {
  public void m1()
  {
     System.out.println("Static nested class method");
  }
 } // Static nested class ends here.
public static void main(String[] args)
{
// Since class B is static nested class, not a regular inner class, Therefore, outer class object is not required.
// You can directly create an object of static nested class like this.
    B b = new B();
    b.m1();
   }*/

//+++++++++++++++++++++++++3. Abstract Class:
    /*// Declaration of instance method.
 public void msg1()
 {
    System.out.println("msg1-Hello");
  }
abstract public void msg2();
}
public class Test extends Hello
{
// Overriding abstract method.
  public void msg2()
  {
   System.out.println("msg2-Test");
  }
public static void main(String[] args)
{
// Creating object of subclass Test.
  Test obj = new Test();
    obj.msg1();
    obj.msg2();
    }
    */

//   ++++++++++++++++++++++++ Final Class:
 /*   final class Hello
{
// Declaration of instance method.
 public void msg()
 {
    System.out.println("msg-Hello");
  }
}
public class DerivedClass extends Hello
{
public void msg()
{
 System.out.println("msg-DerivedClass");
 }
}
public class R_38_Type_class {
public static void main(String[] args)
{
 DerivedClass d = new DerivedClass();
  d.msg();
 }
}*/



}
