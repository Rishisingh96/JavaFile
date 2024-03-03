package com.Collection;

public class Access_Getter_Setter {
    public static void main(String[] args) {
        Getter_Setters access = new Getter_Setters();

       // access.rollNumber = -1;
       // access.displey();

        // access.rollNumber = -1;    //java: rollNumber has private access in com.OtherTeacher.Getter_Setters
        // access.displey();

        //access.setRollNumber(-1);   // Exception throw
        access.setRollNumber(45);   // We can access private variable using getter and setter
        //access.setName("Rishi singh");
        access.setName();
        access.displey();
    }
}
