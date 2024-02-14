package com.company;

class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and My name is "+name);
    }

}
public class R_38_custom_Class {
    public static void main(String[] args){
        System.out.println("This is our custom class");
        Employee rishi = new Employee();  //Instantiating a new Employee Object
        Employee harry = new Employee();  // Instantiating a new Employee Object

        // Setting Attributes for Rishi
        rishi.id = 12;
        rishi.salary = 30000;
        rishi.name = "Rishi singh";
    }
}
