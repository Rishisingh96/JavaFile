package com.Design_Patterns.Singleto_Design_Pattern;

public enum SamosE {
    INSTANCE;

    //✅ Pros: Thread-safe, serialization-safe, reflection-proof.
    //❌ Cons: Can't extend other classes.
    public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }
}

