package rishi.Java.TreeSet;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    int R_Number;
    String Name;

    public Student(int r_Number, String name) {
        R_Number = r_Number;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "R_Number=" + R_Number +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        //1. Compare based on R_Number
       // return Integer.compare(this.R_Number, o.R_Number);

        //2.way
//        if(this.R_Number == o.R_Number){
//            return 0;
//        } else if (this.R_Number>o.R_Number) {
//            return 1;
//        }else {
//            return -1;
//        }

        //3rd way
      //  return (this.R_Number - o.R_Number);

        return Integer.compare(o.R_Number,this.R_Number);
    }
}

public class TreeSetFirstCode {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        // Adding students to the TreeSet
        ts.add(new Student(300, "Rishi singh"));
        ts.add(new Student(50, "Rohit"));
        ts.add(new Student(60, "Mohit"));
        ts.add(new Student(600, "Monu"));

        // Printing all students in sorted order
        ts.forEach(System.out::println);
    }
}
