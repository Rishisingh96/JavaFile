package com.Java.Inheritance;

class Phone
{
    public void showTime(){
        System.out.println("This is 8 am");
    }

    public void on(){
        System.out.println("Turnig on Phone...");
    }

    public void name() {
        System.out.println("My name is Rishi singh.");
    }
}

class smartPhone extends Phone
{
    public void music(){
        System.out.println("Playing music ... ");
    }
    public void on(){
        System.out.println("Turning on smartPhone....");
    }
}
class  R_49_Dynamic_method
{
    public static void main(String[] args)
    {
        /*
        Phone obj = new Phone();
        smartPhone smobj = new smartPhone();
        obj.name();
        obj.on();
        smobj.music();
        */
        Phone obj = new smartPhone(); // yes it is allowed
//        smartPhone obj2 = new Phone();  //Not allowed

        obj.showTime();
        obj.on();
    // obj.music();  // Not allowed
    }
}

