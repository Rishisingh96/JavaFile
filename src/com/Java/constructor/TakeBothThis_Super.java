package com.Java.constructor;

class School1{
    //Declare instance variables.
    String stName;
    int stRoll;
    int stId;
    School1(String schoolName){
        this(2); // Calling one parameter current class constructor with passing integer value within the same class.
        System.out.println("Student's Detail:");
    }
    School1(int s){
        System.out.println("Delhi Public School");
    }
    School1(String stName, int stRoll,int stId){
        this("DPS"); // Calling one parameter current class constructor with passing String argument within same class.
       this.stName = stName;
        this.stRoll = stRoll;
        this.stId = stId;
    }
    void display(){
        System.out.println("Name : " + stName);
        System.out.println("Roll No : " + stRoll);
        System.out.println("Id : " + stId);
    }
}
class Student1 extends School1{ // extends is used for developing inheritance between two classes.

    Student1(){
        super("Rishi", 2, 101);// It will call super class constructor with passing three argument values.

        // Calling one parameter parent class constructor with passing String argument within parent class.
    }
    Student1(String schoolName){
       this();
    }
}

public class TakeBothThis_Super {
    public static void main(String[] args) {
        // Create an object of the class School and pass string to its constructor.

        Student1 student1 = new Student1("Rishi"); // Calling one parameter const. of same class.

        student1.display();
    }
}
/*Alright! Let's dry run your code step-by-step, very carefully.

The starting point is this class and method:

java
Copy
Edit
public class TakeBothThis_Super {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Rishi");
        student1.display();
    }
}
Step 1: Execution starts at main()
We are creating an object:

java
Copy
Edit
Student1 student1 = new Student1("Rishi");
This calls Student1(String schoolName) constructor.

Step 2: Inside Student1(String schoolName)
java
Copy
Edit
Student1(String schoolName){
    this(); // Calls the no-argument constructor of Student1
}
So now it calls Student1() (no-argument constructor).

Step 3: Inside Student1()
java
Copy
Edit
Student1() {
    super("Rishi", 2, 101);
}
The first line of a constructor must be a call to this() or super().
Here, super("Rishi", 2, 101); calls Parent class (School1) constructor that accepts 3 arguments.

Step 4: Inside School1(String stName, int stRoll, int stId)
java
Copy
Edit
School1(String stName, int stRoll, int stId){
    this("DPS");
    this.stName = stName;
    this.stRoll = stRoll;
    this.stId = stId;
}
First line is:

java
Copy
Edit
this("DPS");
So now it calls School1(String schoolName) constructor.

Step 5: Inside School1(String schoolName)
java
Copy
Edit
School1(String schoolName){
    this(2);
    System.out.println("Student's Detail:");
}
First line:

java
Copy
Edit
this(2);
calls School1(int s) constructor.

Step 6: Inside School1(int s)
java
Copy
Edit
School1(int s){
    System.out.println("Delhi Public School");
}
Prints:

vbnet
Copy
Edit
Delhi Public School
This constructor ends and control goes back to School1(String schoolName).

Step 7: Back to School1(String schoolName)
After this(2);, the next line is:

java
Copy
Edit
System.out.println("Student's Detail:");
Prints:

rust
Copy
Edit
Student's Detail:
Then this constructor ends, and control returns back to School1(String stName, int stRoll, int stId).

Step 8: Back to School1(String stName, int stRoll, int stId)
Now these assignments happen:

java
Copy
Edit
this.stName = stName; // stName = "Rishi"
this.stRoll = stRoll; // stRoll = 2
this.stId = stId;     // stId = 101
Then this constructor ends, and control returns back to Student1().

Step 9: Back to Student1()
Nothing else is there after super(...), so control returns back to Student1(String schoolName).

Step 10: Back to Student1(String schoolName)
Nothing else after this();, so constructor finishes.

Now object student1 is fully created.

Step 11: student1.display() is called.
Inside display() method:

java
Copy
Edit
void display(){
    System.out.println("Name : " + stName);
    System.out.println("Roll No : " + stRoll);
    System.out.println("Id : " + stId);
}
Prints:

yaml
Copy
Edit
Name : Rishi
Roll No : 2
Id : 101
Final Output on Console:
text
Copy
Edit
Delhi Public School
Student's Detail:
Name : Rishi
Roll No : 2
Id : 101
✅ So the program runs successfully and prints these lines in this exact order!*/