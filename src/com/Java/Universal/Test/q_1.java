package com.Java.Universal.Test;
interface StudentFee{
    void printFees(int fee);
}
class Student implements StudentFee{

    @Override
    public void printFees(int fee) throws IllegalArgumentException {
        if(fee<0){
            throw new IllegalArgumentException("Illigal value please give positive number");
        }
        else {
            System.out.println("fees =" + fee);
        }
    }
}
public class q_1 {
    //week 6 -8
    //week 5-3
    /*Create an interface StudentFee and declare following method.
void printFees(int fees) throws IllegalArgumentException . Design a case from
your side where for certain value of parameter fees , IllegalArgumentException
*/
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Hello word");
        try{
            student.printFees(50000);
            student.printFees(-50000);
        }catch (IllegalArgumentException e){
            System.out.println("Exception :" + e.getMessage());
        }
    }
}
