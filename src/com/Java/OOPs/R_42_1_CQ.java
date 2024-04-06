package com.Java.OOPs;
 class myEmployee{
    private int salary;

    public myEmployee(){
     salary = 40000;
    }
  public myEmployee(int mySalary){
   salary = mySalary;
  }
    public int getSalary(){ return salary; }
 }
public class R_42_1_CQ {
  public static void main(String arg[]){
//   myEmployee rishi = new myEmployee();
   myEmployee rishi = new myEmployee(40000);
   System.out.println(rishi.getSalary());
  }
}
