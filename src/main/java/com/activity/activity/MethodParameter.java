package com.activity.activity;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Affan", "Ramadhan");
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello" + firstname + " " + lastname);
    }
}
