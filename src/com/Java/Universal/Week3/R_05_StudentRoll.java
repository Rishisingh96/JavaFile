package com.Java.Universal.Week3;
/*Create a class Student with teo members : rollno and percentage
a) Create default and parameterised constructors.
b) Create method show() to display infomation.
c) Create another class CollegeStudent that inherits Student class. Add a new
member semester to it.Create default and parameterised constructors , also
override show() method.
d) Create another class SchoolStudent that inherits Student class. Add a
new member classname(e.g. 10Th , 12th) to it. Create default and
parameterised constructors, also override show() method.
e) Create a class XYZ with main() that carries out following operations -
i) has array to store objects of any class(Student or CollegeStudent
or SchoolStudent)
ii) Create two CollegeStudent and three SchoolStudent record objects and stire
iii) them inside the array.
iii) Display all records from the array.
iv) Search record on the basis of rollno nad check given rollno is of
SchoolStudent or of CollegeStudent
*/
class Student{
    int roll_no;
    int percentage;
    public Student(){}
    public Student(int roll_no,int percentage){
       this.roll_no= roll_no;
        this.percentage = percentage;
    }
    public void show(){
        System.out.println("Your roll no is = "+roll_no +" "+" your percentage is =" + percentage);
    }
    public int getRollNo(){
        return roll_no;
    }
}
class CollegeStudent extends Student{
    int semester;
   public CollegeStudent(){}

    public CollegeStudent(int roll_no, int percentage, int semester) {
        super(roll_no, percentage);
        this.semester = semester;
    }
    @Override
    public void show(){
        super.show();
        System.out.println(" semester = "+semester);
    }
}
class SchoolStudent extends Student{
    String class_name;
    public SchoolStudent(){};

    public SchoolStudent(int roll_no, int percentage, String class_name) {
        super(roll_no, percentage);
        this.class_name = class_name;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Class Name = "+class_name);
    }
}

public class R_05_StudentRoll {
    public static void main(String[] args) {
        Student[] students = new Student[5];

         students[0]= new CollegeStudent(20,70,5);
         students[1]= new CollegeStudent(21,80,6);

         students[2]= new SchoolStudent(30,80,"12th");
         students[3]= new SchoolStudent(31,70,"10th");
         students[4]= new SchoolStudent(32,60,"12th");

         for(Student student:students){
             student.show();
             System.out.println();
         }
         //Search record based on roll no
        int searchRollNo = 21;
         boolean found = false;
         for(Student student: students){
             if(student.getRollNo()==searchRollNo){
                 System.out.println("Found student with roll no "+ searchRollNo+" ");
                 if(student instanceof CollegeStudent){
                     System.out.println("This is collage Student");
                 } else if (student instanceof SchoolStudent) {
                     System.out.println("This is School Student");
                 }
                 student.show();
                 found = true;
                 break;
             }
         }
         if(!found){
             System.out.println("No student found with roll no "+ searchRollNo);
         }
    }
}


/*Let's perform a dry run of the provided code, focusing on the section that searches for a record based on roll number.

### Dry Run: Initialization and Array Setup

1. **Initialization:**
   - A `Student` array of size 5 is created: `Student[] students = new Student[5];`.

2. **Adding CollegeStudent and SchoolStudent objects to the array:**
   - `students[0]` = new `CollegeStudent(20, 70, 5)`:
     - `roll_no` = 20
     - `percentage` = 70
     - `semester` = 5
   - `students[1]` = new `CollegeStudent(21, 80, 6)`:
     - `roll_no` = 21
     - `percentage` = 80
     - `semester` = 6
   - `students[2]` = new `SchoolStudent(30, 80, "12th")`:
     - `roll_no` = 30
     - `percentage` = 80
     - `class_name` = "12th"
   - `students[3]` = new `SchoolStudent(31, 70, "10th")`:
     - `roll_no` = 31
     - `percentage` = 70
     - `class_name` = "10th"
   - `students[4]` = new `SchoolStudent(32, 60, "12th")`:
     - `roll_no` = 32
     - `percentage` = 60
     - `class_name` = "12th"

### Dry Run: Displaying All Records

3. **Displaying all records:**
   - For each element in the `students` array, the `show()` method is called:
     - For `students[0]`:
       - Output: `Your roll no is = 20 your percentage is = 70 semester = 5`
     - For `students[1]`:
       - Output: `Your roll no is = 21 your percentage is = 80 semester = 6`
     - For `students[2]`:
       - Output: `Your roll no is = 30 your percentage is = 80 Class Name = 12th`
     - For `students[3]`:
       - Output: `Your roll no is = 31 your percentage is = 70 Class Name = 10th`
     - For `students[4]`:
       - Output: `Your roll no is = 32 your percentage is = 60 Class Name = 12th`

### Dry Run: Search Record Based on Roll Number

4. **Search for roll number 31:**
   - Variable `searchRollNo` is set to 31.
   - Loop iterates over the `students` array to find a student with `roll_no` 31:
     - **Iteration 1:**
       - `student` = `students[0]`
       - `student.getRollNo()` returns 20 (not equal to 31), continue to next iteration.
     - **Iteration 2:**
       - `student` = `students[1]`
       - `student.getRollNo()` returns 21 (not equal to 31), continue to next iteration.
     - **Iteration 3:**
       - `student` = `students[2]`
       - `student.getRollNo()` returns 30 (not equal to 31), continue to next iteration.
     - **Iteration 4:**
       - `student` = `students[3]`
       - `student.getRollNo()` returns 31 (equal to `searchRollNo` 31).
       - Output: `Found student with roll no 31: This is a School Student.`
       - `show()` method for `students[3]` is called:
         - Output: `Your roll no is = 31 your percentage is = 70 Class Name = 10th`
       - Set `found` to `true` and break the loop.
     - **Iteration 5:**
       - Not reached because the loop has been broken.

5. **No student found with roll number 31:**
   - Since `found` is `true`, the message `No student found with roll no 31` is not printed.

### Summary of Output

1. Display all records:
   ```
   Your roll no is = 20 your percentage is = 70 semester = 5

   Your roll no is = 21 your percentage is = 80 semester = 6

   Your roll no is = 30 your percentage is = 80 Class Name = 12th

   Your roll no is = 31 your percentage is = 70 Class Name = 10th

   Your roll no is = 32 your percentage is = 60 Class Name = 12th
   ```

2. Search for roll number 31:
   ```
   Found student with roll no 31: This is a School Student.
   Your roll no is = 31 your percentage is = 70 Class Name = 10th
   ```

This dry run demonstrates how the program processes the student records and performs the search functionality based on the roll number, correctly identifying and displaying the details of the `SchoolStudent` with roll number 31.
*/