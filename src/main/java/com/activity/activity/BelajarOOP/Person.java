package com.activity.activity.BelajarOOP;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }

    void SayGoodbye(String name) {
        System.out.println("Goodbye " + name + ", have a safe trip to " + this.address);
    }

}