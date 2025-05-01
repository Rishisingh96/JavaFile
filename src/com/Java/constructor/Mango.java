package com.Java.constructor;

public class Mango
{
    boolean sweet;
    Mango(boolean b)
    {
        sweet = b;
    }
    Mango(Mango m)
    {
        sweet = m.sweet;
    }
    public void flavor()
    {
        if(sweet)
            System.out.println("Mango is sweet");
        else
            System.out.println("Mango is not sweet");
    }
}
