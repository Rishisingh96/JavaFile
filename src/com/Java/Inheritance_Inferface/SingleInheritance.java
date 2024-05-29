package com.Java.Inheritance_Inferface;

class FundamentalForce {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}
class Gravitational extends FundamentalForce1 {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}
class SingleInheritance {
    public static void main(String[] args) {
        Gravitational1 G = new Gravitational1();
        G.Force();
        G.Gravity();
    }
}

