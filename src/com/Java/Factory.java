package com.Java;

import java.io.Serializable;

public class Factory implements Serializable {
    int code;
    String name;
    String location;

    public Factory(int code, String name, String location) {
        this.code = code;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
