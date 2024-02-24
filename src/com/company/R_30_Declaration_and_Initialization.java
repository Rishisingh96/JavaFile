package com.company;

public class R_30_Declaration_and_Initialization {

//    Ways to Initialize State of Object in Java
//    There are three ways by which we can initialize state of an object. In other words, we can initialize the value of variables in Java by using three ways. They are as follows:
//            • By using constructor
//	    • By using a reference variable
//	    • By using a method.

    //================================================
//    Object Initialization by using Constructor
  /*
        // Declaration of instance variables, i.e. states of an object. 
        String name;
        int rollNo;
        int age;

 // Declaration of a default constructor. The constructor name must be the same as the class name.
        R_30_Declaration_and_Initialization()  //R_30_Declaration_and_Initialization = Student
        {
// Initialize states of an object, i.e. values of variables. 
            name = "Shubh";
            rollNo = 05;
            age = 22;
        }

        // Declare an instance method.
        void display()
        {
// Displaying the values of variables.
// This is an instance area. Therefore, we can directly call the instance variables.
            System.out.println("Student's name:" +name);
            System.out.println("Student's roll no: " +rollNo);
            System.out.println("Student's age:" +age);
        }
        // Declare the main method. It is a static method. So, it is a static area. 
        public static void main(String[] args) {
// Create an object of the class. 
            R_30_Declaration_and_Initialization st = new R_30_Declaration_and_Initialization(); // It will call the default constructor.

// Call display method using object reference variable st because we cannot call non-static members directly in the static region. 
            st.display();
        }



//========================================================================
    // Declare instance variables. This is an instance area or region.
    String subject1;
    int sub1Marks;
    String subject2;
    int sub2Marks;

    // Declare main method. This is a static region.
    public static void main(String[] args)
    {
// Create an object of the class.
        R_30_Declaration_and_Initialization mk = new R_30_Declaration_and_Initialization();
// Initialize values of variables through object reference variable and dot notation.
        mk.subject1 = "Science";
        mk.sub1Marks = 90;
        mk.subject2 = "Maths";
        mk.sub2Marks = 99;

// Adding total marks and storing into a variable named totalMarks.
        int totalMarks = 90 + 99;

// Call marks using object reference variable.
        System.out.println("Marks in Science:" +mk.sub1Marks);
        System.out.println("Marks in Maths:" +mk.sub2Marks);
        System.out.println("Total Marks: " +totalMarks);
    }

   */
    //===========================================================
    //Object Initialization by using Method

    int length;
    int breadth;

    // Declare an instance method with parameters l and b of data type int.
    void perValue(int l, int b)
    {
// Here, we are setting the name of parameters different from the name of the variables.
// Because we are not using this reference.
        length = l;
        breadth = b;
    }
    void calculate()
    {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " +perimeter);
    }
    public static void main(String[] args)
    {
        // Create the first object of class.
        R_30_Declaration_and_Initialization rt = new R_30_Declaration_and_Initialization();

// This statement will call perValue method and initialize values to the instance variables.
        rt.perValue(20, 30);

// This statement will call calculate() method and display the output.
        rt.calculate();

// Create the second object of class.
        R_30_Declaration_and_Initialization rt2 = new R_30_Declaration_and_Initialization();
        rt2.perValue(50, 50);
        rt2.calculate();
    }

}
