package com.techreturners.exercise002;

import java.util.Arrays;

public class Person {

    private final String[] names;
    private final String location;
    private final int age;

    public Person(String firstname, String surname, String location, int age) {
        names = new String[2];
        names[0] = firstname;
        names[1] = surname;
        this.location = location;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Person{" +
                String.join(" ", names) +
                " from " + location +
                ", " + age +
                " years}";
    }
}
