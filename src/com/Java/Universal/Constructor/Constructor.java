package com.Java.Universal.Constructor;
/*There are four Type of Constructor.
* 1 = Default Constructor
* 2 = No argument constructor(non parametrized)
* 3 = Parametrized constructor
* 4 = Copy Constructor
*/

class Student{
     int roll;
     String name;

    // Constructor
    Student(int rl, String nm)
    {

        roll = rl;
        name = nm;
    }
    void showData(){
        System.out.println(roll + "/" + name);
    }
}
public class Constructor {
    public static void main(String[] args) {
    Student s1 = new Student(101,"Rishi");
    Student s2 = new Student(102,"Garima");
      s1.showData();
      s2.showData();
    }
}
