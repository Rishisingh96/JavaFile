package com.Design_Patterns.Singleto_Design_Pattern;

import java.io.*;

public class EnumSingletonSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;

        // Serialize to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(instance1);
        oos.close();

        // Deserialize from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        EnumSingleton instance2 = (EnumSingleton) ois.readObject();
        ois.close();

        // Checking if both instances are the same
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        if (instance1 == instance2) {
            System.out.println("Serialization did not break Singleton.");
        } else {
            System.out.println("Serialization broke Singleton!");
        }
    }
}
