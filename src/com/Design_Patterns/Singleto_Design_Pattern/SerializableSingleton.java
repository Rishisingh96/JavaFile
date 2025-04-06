package com.Design_Patterns.Singleto_Design_Pattern;

import java.io.*;

class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Private static instance
    private static SerializableSingleton instance;

    // Private constructor to prevent instantiation
    private SerializableSingleton() { }

    // Public method to provide access to the instance
    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    // Ensures that the same instance is returned during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
