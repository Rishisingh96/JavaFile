package com.Java;

import java.io.*;

public class Company{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        int arr[] = new int[4];
        employee obj  = new employee(101,"Rishi","Software Engineer",50000);
//        employee obj2  = new employee(102,"Mohit","Data Engineer",40000);
//        employee obj3  = new employee(103,"Shyam","AI Engineer",60000);
//        employee obj4  = new employee(104,"Rohan","Network Engineer",30000);
        Factory obj2 = new Factory(201,"FoodBekri","Lucknow");

//        System.out.println(obj1.toString());
//        System.out.println(obj2.toString());
//        System.out.println(obj3.toString());
//        System.out.println(obj4.toString());

        //For File Create
   //     try{
//            File obj = new File("employee.txt");
//            if(obj.createNewFile()){
//                System.out.println("Created Successfully ");
//            }else {
//                System.out.println("Sorry, File Exists.");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Using String method
            //String name = String.valueOf(obj1);
            //byte[] ch = name.getBytes();
//        FileOutputStream Fw = new FileOutputStream("employee.txt");
//        Fw.write(ch);
//        System.out.println("Object Saved to File");


        //Write object Using Serialization method  file same in object form
        FileOutputStream Fw = new FileOutputStream("employee.txt");
        ObjectOutputStream oos = new ObjectOutputStream(Fw);
       // oos.writeObject(obj);
        oos.writeObject(obj2);
        System.out.println("Object Saved to File");

        //Fetch Data Using DeSerialization method
        FileInputStream Fr = new FileInputStream("employee.txt");
        ObjectInputStream fs = new ObjectInputStream(Fr);
        System.out.println(fs.readObject());
    }
}
/*Serialization and Deserialization in Java
Definition:

Serialization is the process of converting an object's state into a byte stream. This byte stream can be saved to a file, sent over a network, or persisted in some other way. It is useful for saving the state of an object so that it can be restored later.

Deserialization is the process of converting a byte stream back into an object. It reconstructs the object from the byte stream that was produced during serialization.

Use in Projects
Serialization and deserialization are often used in the following scenarios:

Saving Object State: To persist the state of an object between program executions. For example, saving user settings or game progress.

Data Exchange: Transmitting objects over a network. For instance, sending objects from a client to a server or between different servers.

Caching: Storing objects in a cache for quick retrieval. This can be useful for frequently accessed data.

Deep Copy: Creating a deep copy of an object, especially when dealing with complex object graphs.

Advantages and Disadvantages
Advantages:

Simplicity: Simplifies the process of persisting and transmitting object states without needing manual conversion to and from a data format.

Built-in Support: Java provides built-in mechanisms for serialization through the Serializable interface and ObjectOutputStream/ObjectInputStream classes.

Object-Oriented: Keeps the object-oriented programming paradigm intact, preserving the object's state and behavior.

Cross-Platform: Serialized objects can be read and written across different platforms, making it useful for distributed applications.

Disadvantages:

Performance Overhead: Serialization can introduce performance overhead due to the conversion process and additional metadata.

Versioning Issues: Changes to the class structure can lead to InvalidClassException during deserialization if the serialVersionUID does not match.

Security Risks: Serialized data can be vulnerable to attacks if not properly managed, especially when deserializing data from untrusted sources.

Increased Complexity: Implementing Externalizable or managing complex object graphs can increase the complexity of the code.

Example of Serialization and Deserialization
Here’s a detailed example to illustrate serialization and deserialization:

1. Serialization
java
Copy code
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version compatibility
    private String name;
    private int age;
    private transient String password; // Transient field will not be serialized

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password=" + (password == null ? "null" : "****") + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, "password123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
2. Deserialization
java
Copy code
import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Object deserialized successfully: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
Explanation of the Example
Person Class: Implements Serializable and contains a transient field (password) that will not be serialized. The serialVersionUID is used to ensure version compatibility.

SerializationExample Class: Creates a Person object and serializes it to a file named person.ser.

DeserializationExample Class: Reads the serialized Person object from the file and prints its details. Note that the password field will be null in the deserialized object because it was marked as transient.

Summary
Serialization and deserialization are essential mechanisms in Java for converting objects to and from byte streams. They are widely used for persisting object state, exchanging data, and caching, among other purposes. While they offer many benefits, including simplicity and cross-platform compatibility, they also have drawbacks such as performance overhead and potential security risks. Understanding and managing these aspects is crucial for effective use of serialization in Java projects.*/