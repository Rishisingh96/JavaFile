package com.Java;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 5;
        name = "Your-Name-user";
    }
    public MyMainEmployee(String myName, int myId){
            id = myId;
            name = myName;
    }

    public MyMainEmployee(String myName){
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
}
public class R_42_Constructor {
    public static void main(String arg[]){
       MyMainEmployee rishi = new MyMainEmployee();                                // Constructor 1
  //      MyMainEmployee rishi = new MyMainEmployee("rishi singh", 20);             // Constructor 2
      //  MyMainEmployee rishi = new MyMainEmployee("rishi singh boss",8);    // parameterized Constructor 3
        /*rishi.setId(45);      // When we use constructor than not need setId or setName we are call directly.
        rishi.setName("Rishi singh");*/
        System.out.println(rishi.getId());
        System.out.println(rishi.getName());
    }
}
