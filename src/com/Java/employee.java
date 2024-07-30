package com.Java;

public class employee implements java.io.Serializable {
        int Code;
        String Name;
        String Post;
        int Salary;
          public employee() {  //default
             }
    public employee(int code, String name, String post, int salary) {
        Code = code;
        Name = name;
        Post = post;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "Code=" + Code +
                ", Name='" + Name + '\'' +
                ", Post='" + Post + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
