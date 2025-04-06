package com.Design_Patterns.Singleto_Design_Pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializationTest {
    public static void main(String[] args) {
        try {
            // Get singleton instance
            SerializableSingleton instance1 = SerializableSingleton.getInstance();
            System.out.println("Instance 1 hashcode: " + instance1.hashCode());

            // Serialize the object
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
            in.close();

            System.out.println("Instance 2 hashcode: " + instance2.hashCode());

            // Check if the same instance is returned
            System.out.println("Are both instances same? " + (instance1 == instance2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
