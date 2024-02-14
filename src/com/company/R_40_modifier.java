package com.company;
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class R_40_modifier {
    public static void main(String arg[]){
        MyEmployee rishi =new MyEmployee();
//        rishi.id = 45;
//        rishi.id = "Rishi singh";  // Throw an error due to private access modifier

        rishi.setId(300);
        System.out.println(rishi.getId());

        rishi.setName("Rishi singh");
//      rishi.setName = "Rishi singh";  // wrong
        System.out.println(rishi.getName());
    }
}
