package com.Java.Universal.Week4;
class Person{
    String name;
    int age;
    String address;
    public Person(){};
    public Person(String name , int age, String address){
        this.name  = name;
        this.age = age;
        this.address = address;

    }
    void show (){
        System.out.println("Name is = "+ name +" age = "+ age +" address = "+address);
    }
}
class Student extends Person {
    int rollno;
    String breanch;
    int semester;

    public Student(int rollno, String breanch, int semester) {
        super();
        this.rollno = rollno;
        this.breanch = breanch;
        this.semester = semester;
    }

    public Student() {
        super();
    }

    @Override
    void show () {
        System.out.println("Roll No = "+rollno + " Breanch Name = "+ breanch + " Semester = " +semester);
    }
}
class Facalty extends Person{
    int facultyId;
    String name;
    int salary;
    String branch;

    public Facalty(){};
    public Facalty(int facultyId,String name,int salary, String branch){
        this.facultyId = facultyId;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    };
    public String toString() {
        return ("Facalty Id = " +facultyId+" Facalty Name = "+name+" Salary =  "+salary + " branch Name = "+ branch);

    }
    public int getSalary() {
//		return salary+salary+salary+salary+salary;
        return salary;
    }
}

class Fees{
    String student;
    int amount;
    String paymentDate;
    static int totalAmount = 0; // Static variable to track the total amount

    public Fees() {}

    public Fees(String student, int amount, String paymentDate) {
        this.student = student;
        this.amount = amount;
        this.paymentDate = paymentDate;
        totalAmount += amount; // Update the total amount whenever a new Fees object is created
    }

    @Override
    public String toString() {
        return "Student Name: " + student + " Amount is = " + amount + " Payment Date = " + paymentDate;
    }

    public static int getTotalAmount() {
        return totalAmount;
    }
}
public class SturctureCode {
    public static void main(String[] args) {
        Person p = new Person("Rishi",22,"U.P");
        p.show();

        Student s = new Student(33,"C.S",6);
        s.show();

        Facalty[] facalty = new Facalty[5];
        facalty[0]  = new Facalty(45,"Kishan sir",50000,"DSA");
        facalty[1] = new Facalty(46,"Kishan sir",50000,"C");
        facalty[2] = new Facalty(47,"Kishan sir",50000,"c++");
        facalty[3] = new Facalty(49,"Kishan sir",50000,"DSA");
        facalty[4] = new Facalty(60,"Kishan sir",50000,"DSA");

        int totalS = 0;
        for(Facalty facaltyS : facalty) {
            System.out.println(facaltyS.toString());
            totalS = totalS + facaltyS.getSalary();
        }
        System.out.println("Total Salary is = "+ totalS);
		//System.out.print(f.toString());

        Fees fees0 = new Fees("Ravi Kumar", 20000, "12-09-2024");
        Fees fees1 = new Fees("Ravi Singh", 20000, "12-09-2024");
        Fees fees2 = new Fees("Ravi Yadav", 20000, "12-09-2024");
        Fees fees3 = new Fees("Ravi Kumar", 20000, "12-09-2024");

        System.out.println(fees0.toString());
        System.out.println(fees1.toString());
        System.out.println(fees2.toString());
        System.out.println(fees3.toString());

        // Print the total fees amount
        System.out.println("Total Fees Amount: " + Fees.getTotalAmount());
    }
}
