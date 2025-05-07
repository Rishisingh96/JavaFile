package com.Java.Polymorphism_interface;
class College
{
    public void collegeName()
    {
        System.out.println("Name of my college is PIET ");
    }
    // Overridden method.
    void estYear()
    {
        System.out.println("It was established in 1999");
    }
}
class MyCollege extends College
{
    // Here, we are increasing visibility the overriding method.
    protected void estYear()
    {
        System.out.println("It was established in 2001");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        MyCollege myCollege = new MyCollege();
        myCollege.collegeName();
        myCollege.estYear();
        // Creating an object of the parent class
        System.out.println("-----------------");
        College college = new College();
        college.collegeName();
        college.estYear();
    }
}
