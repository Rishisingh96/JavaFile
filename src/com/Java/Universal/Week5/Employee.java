package com.Java.Universal.Week5;

public class Employee {
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

    //way 2
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        Employee employee = (Employee) obj;
//
//        return eno == employee.eno;
//    }
//
//    @Override
//    public int hashCode() {
//        return Integer.hashCode(eno);
//    }


}