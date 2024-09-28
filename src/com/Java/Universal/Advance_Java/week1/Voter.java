package com.Java.Universal.Advance_Java.week1;

import java.util.Objects;

class Voter implements Comparable<Voter> {
    private int age;
    private String name;

    public Voter(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Voter other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Voter{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voter voter = (Voter) o;
        return age == voter.age && name.equals(voter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
