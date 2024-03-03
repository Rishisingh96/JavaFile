package com.Java.OOPs;

class Employee1 {
    //    Problem 1
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
//    problem 2
class CellPhone{
       public void ring(){
           System.out.println("Ringing.....");
       }
       public void vibrate(){
           System.out.println("Vibrating....");
       }
       public void cellFriend(){
           System.out.println("Calling Rishi.....");
       }
}
//problem 3
class Square{
    int a;

    public int area() {
        return a * a;
//        System.out.println();
    }

    public int perimeter() {
        return a * 4;
    }
}
//problem 5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy ...");
    }
    public void run(){
        System.out.println("Running from the enemy ......");
    }
    public void fire(){
        System.out.println("Firing on the enemy.......");
    }
}
    public class R_39_Question {
        public static void main(String arg[]) {
/*
        // Problem 1
        Employee1 s = new Employee1();
        s.Salary = 4000;
        s.setName("Rishi singh");  // this is set name method take a string name and return getName
//        s.name = "Rishi";      // this is getName methode so return name
        System.out.println(s.getSalary());
//        System.out.println(s.setName());   // we not print because he is setName take a input from user
        System.out.println(s.getName());

//      Problem 2
            CellPhone rishi = new CellPhone();
            rishi.vibrate();
            rishi.cellFriend();
            rishi.ring();

//        Problem 3
            Square sq = new Square();
            sq.a = 3;
            System.out.println(sq.area());
            System.out.println(sq.perimeter());

            */
//            Problem 4

//            Problem 5
            Tommy player1 = new Tommy();
            player1.fire();
            player1.run();
            player1.hit();

        }
    }
