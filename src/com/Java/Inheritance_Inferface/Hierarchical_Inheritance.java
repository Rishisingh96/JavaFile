package com.Java.Inheritance_Inferface;

class FundamentalForce1 {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}
class Gravitational1 extends FundamentalForce1 {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}
class Electromagnetic extends FundamentalForce1 {
    void Particles() {
        System.out.println("The electromagnetic force acts between charged particles");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        System.out.println("Child 1:");
        Gravitational1 G = new Gravitational1();
        G.Force();
        G.Gravity();

        System.out.println();
        System.out.println("Child 2");
        Electromagnetic em = new Electromagnetic();
        em.Force();
        em.Particles();

    }
}
