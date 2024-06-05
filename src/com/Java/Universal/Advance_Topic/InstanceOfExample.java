class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void show() {
        System.out.println("Student Roll No: " + rollNo + ", Name: " + name);
    }
}

class CollegeStudent extends Student {
    int semester;

    public CollegeStudent(int rollNo, String name, int semester) {
        super(rollNo, name);
        this.semester = semester;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Semester: " + semester);
    }
}

class SchoolStudent extends Student {
    String className;

    public SchoolStudent(int rollNo, String name, String className) {
        super(rollNo, name);
        this.className = className;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Class: " + className);
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Student student1 = new CollegeStudent(1, "Alice", 3);
        Student student2 = new SchoolStudent(2, "Bob", "10th");

        checkStudentType(student1);
        checkStudentType(student2);
    }

    public static void checkStudentType(Student student) {
        if (student instanceof CollegeStudent) {
            CollegeStudent collegeStudent = (CollegeStudent) student;
            System.out.println("This is a CollegeStudent:");
            collegeStudent.show();
        } else if (student instanceof SchoolStudent) {
            SchoolStudent schoolStudent = (SchoolStudent) student;
            System.out.println("This is a SchoolStudent:");
            schoolStudent.show();
        } else {
            System.out.println("This is a general Student:");
            student.show();
        }
    }
}
/*
The `instanceof` operator in Java is used to test whether an object is an instance of a specific class or an interface. This operator is particularly useful in scenarios where you need to ensure that an object is of a certain type before performing type-specific operations or casting it to that type.

### When to Use `instanceof`
1. **Type Safety**: Before casting an object to a subclass or interface, to avoid `ClassCastException`.
2. **Polymorphism**: To determine the actual object type at runtime when you have a reference of a superclass or interface.
3. **Conditional Logic**: When behavior needs to change based on the specific subclass type.

### Why Use `instanceof`
- **Avoid Runtime Errors**: Helps in avoiding runtime errors by ensuring type safety.
- **Dynamic Behavior**: Allows you to write code that can handle objects of different types in a generic way.

### Example Usage

Consider a scenario where you have a superclass `Student` and subclasses `CollegeStudent` and `SchoolStudent`. You might want to perform certain operations specific to `CollegeStudent` or `SchoolStudent`. Using `instanceof` helps you determine the type of `Student` object at runtime.

#### Example Code:
```java
class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void show() {
        System.out.println("Student Roll No: " + rollNo + ", Name: " + name);
    }
}

class CollegeStudent extends Student {
    int semester;

    public CollegeStudent(int rollNo, String name, int semester) {
        super(rollNo, name);
        this.semester = semester;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Semester: " + semester);
    }
}

class SchoolStudent extends Student {
    String className;

    public SchoolStudent(int rollNo, String name, String className) {
        super(rollNo, name);
        this.className = className;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Class: " + className);
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Student student1 = new CollegeStudent(1, "Alice", 3);
        Student student2 = new SchoolStudent(2, "Bob", "10th");

        checkStudentType(student1);
        checkStudentType(student2);
    }

    public static void checkStudentType(Student student) {
        if (student instanceof CollegeStudent) {
            CollegeStudent collegeStudent = (CollegeStudent) student;
            System.out.println("This is a CollegeStudent:");
            collegeStudent.show();
        } else if (student instanceof SchoolStudent) {
            SchoolStudent schoolStudent = (SchoolStudent) student;
            System.out.println("This is a SchoolStudent:");
            schoolStudent.show();
        } else {
            System.out.println("This is a general Student:");
            student.show();
        }
    }
}
```

### Dry Run of Example Code:
1. **Initialization**:
   - `student1` is a `CollegeStudent` with roll number 1, name "Alice", and semester 3.
   - `student2` is a `SchoolStudent` with roll number 2, name "Bob", and class "10th".

2. **Type Checking and Casting**:
   - `checkStudentType(student1)`:
     - Checks if `student1` is an instance of `CollegeStudent`. This is true, so it casts `student1` to `CollegeStudent` and calls `show()`, printing details including the semester.
   - `checkStudentType(student2)`:
     - Checks if `student2` is an instance of `SchoolStudent`. This is true, so it casts `student2` to `SchoolStudent` and calls `show()`, printing details including the class name.

### Output:
```
This is a CollegeStudent:
Student Roll No: 1, Name: Alice
Semester: 3
This is a SchoolStudent:
Student Roll No: 2, Name: Bob
Class: 10th
```

In this example, `instanceof` is used to check the type of `Student` objects at runtime, allowing the code to perform type-specific operations safely.
*/