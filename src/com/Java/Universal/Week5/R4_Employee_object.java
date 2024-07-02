package com.Java.Universal.Week5;
import com.Collection.set.Waysofcreatset;
import com.Java.Universal.Week5.Employee;

public class R4_Employee_object {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, "Rishi Singh", "Computer Department");
        Employee e2 = new Employee(23, "John Doe", "Human Resources");

        // Printing employee1
        System.out.println(e1.toString());
        System.out.println(e2.toString());

//        Way 1
        if(e1.eno == e2.eno){
            System.out.println("Both employees are the same based on eno.");
        }
        else {
            System.out.println("Employees are different based on eno.");
        }

        //way 2
        // Comparing employee1 and employee2
//        if (e1.equals(e2)) {
//            System.out.println("Both employees are the same based on eno.");
//        } else {
//            System.out.println("Employees are different based on eno.");
//        }
    }
}
/*Sure, let's perform a dry run of the code with the example provided. Here is the step-by-step execution and the expected output.

### Dry Run

#### Initialization

1. **Creating `employee1`**:
   - `employee1` is instantiated with `eno=23`, `ename="Rishi Singh"`, `deptname="Computer Department"`.
   - The `Employee` constructor is called with these values, and the fields are initialized.

2. **Creating `employee2`**:
   - `employee2` is instantiated with `eno=23`, `ename="John Doe"`, `deptname="Human Resources"`.
   - The `Employee` constructor is called with these values, and the fields are initialized.

#### Method Execution

3. **Printing `employee1`**:
   - The `toString` method is called on `employee1`.
   - The method returns the string: `"Employee{eno=23, ename='Rishi Singh'}"`.
   - This string is printed to the console.

4. **Comparing `employee1` and `employee2`**:
   - The `equals` method is called to compare `employee1` and `employee2`.
   - Since both `eno` values are `23`, the method returns `true`.
   - The message "Both employees are the same based on eno." is printed to the console.

### Expected Output

```plaintext
Employee{eno=23, ename='Rishi Singh'}
Both employees are the same based on eno.
```

### Full Code with Output

Here is the full code again for reference:

```java
package com.Java.Universal.Week5;

class Employee {
    int eno;
    String ename;
    String deptname;

    public Employee(int eno, String ename, String deptname) {
        this.eno = eno;
        this.ename = ename;
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return eno == employee.eno;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(eno);
    }
}

public class Employee_object {
    public static void main(String[] args) {
        Employee employee1 = new Employee(23, "Rishi Singh", "Computer Department");
        Employee employee2 = new Employee(23, "John Doe", "Human Resources");

        // Printing employee1
        System.out.println(employee1.toString());

        // Comparing employee1 and employee2
        if (employee1.equals(employee2)) {
            System.out.println("Both employees are the same based on eno.");
        } else {
            System.out.println("Employees are different based on eno.");
        }
    }
}
```

This code correctly prints the `eno` and `ename` of the first `Employee` object and compares the two `Employee` objects based on their `eno`, producing the expected output as described.

Question 1 ---------------------------------------------------
  @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return eno == employee.eno;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(eno);
    }
    
    soul ----------------------------------------------------------------
    Let's dry run the comparison part of the code in more detail, focusing on the equals method.

Dry Run: Comparing employee1 and employee2
Variables
employee1: eno = 23, ename = "Rishi Singh", deptname = "Computer Department"
employee2: eno = 23, ename = "John Doe", deptname = "Human Resources"
Steps
Method Call:

java
Copy code
employee1.equals(employee2)
The equals method is called on employee1 with employee2 as the argument.

Inside equals Method:

this == obj:

this refers to employee1.
obj refers to employee2.
Since employee1 and employee2 are different objects, this == obj evaluates to false.
obj == null:

obj (employee2) is not null, so obj == null evaluates to false.
getClass() != obj.getClass():

getClass() returns the runtime class of the current object (employee1), which is Employee.
obj.getClass() returns the runtime class of employee2, which is also Employee.
Since both are instances of the Employee class, getClass() != obj.getClass() evaluates to false.
eno == employee.eno:

eno of employee1 is 23.
employee is the cast of obj to Employee type, so employee.eno is 23 (from employee2).
Since both eno values are equal (23 == 23), eno == employee.eno evaluates to true.
Result:

Since eno == employee.eno is true, the method returns true.
Output:

Since employee1.equals(employee2) returns true, the message "Both employees are the same based on eno." is printed to the console.
Summary
Comparison Call:
java
Copy code
employee1.equals(employee2)
Returns: true
Output: "Both employees are the same based on eno."
*/