package com.Java.Inheritance_Inferface.Super_This_keyword;

class Person{
    int age = 50;
}
class Employee extends Person{

        int age = 30;
        void insertEmployeeAge()
        {
            int age = 20;
        // Here, we have two ways to call instance variable 'age' of the person.
            // 1st way:
            Person p = new Person();
            System.out.println(p.age); // Output: 50
            // 2nd way:
            System.out.println(super.age); // Output: 50

            // Calling Local variable.
            System.out.println(age);
        // Calling instance variable of the same class.
            System.out.println(this.age); // Output: 30
        }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.insertEmployeeAge();
    }
}
