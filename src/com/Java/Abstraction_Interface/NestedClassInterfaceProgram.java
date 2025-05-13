package com.Java.Abstraction_Interface;
class VehicleTypes
{
    interface Vehicle
    {
        public int getNoOfWheels();
    }
}
class Bus implements VehicleTypes.Vehicle
{
    public int getNoOfWheels()
    {
        return 6;
    }
}
class Car implements VehicleTypes.Vehicle
{
    public int getNoOfWheels()
    {
        return 4;
    }
}
class Bike implements VehicleTypes.Vehicle
{
    public int getNoOfWheels()
    {
        return 2;
    }
}

public class NestedClassInterfaceProgram {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNoOfWheels());
        Car c = new Car();
        System.out.println(c.getNoOfWheels());
        Bike bk = new Bike();
        System.out.println(bk.getNoOfWheels());

    }
}
