
package Exception;
public class M_T_Week {
    public static void main(String args[]) {
        // TODO code application logic here
        //Give that Student is a class, how many reference variable and Object are created by the following code?
//        Student studentName,student;
//        studentName = new Student();
//        Student stud_class = new Student();
    }
}
/*In the given code snippet:

```java
Student studentName, student;
studentName = new Student();
Student stud_class = new Student();
```

Let's break it down:

1. `Student studentName, student;` - This declares two reference variables of type `Student` named `studentName` and `student`. No objects are created here; these are just references that can point to objects of type `Student`.

2. `studentName = new Student();` - This line creates a new object of type `Student` and assigns its reference to the variable `studentName`. So, here one object is created.

3. `Student stud_class = new Student();` - This line declares a new reference variable `stud_class` of type `Student` and immediately assigns it the reference to a new object of type `Student`. So, here one more object is created.

In total, the code creates **two reference variables** (`studentName` and `stud_class`) and **two objects** of type `Student`.
*/