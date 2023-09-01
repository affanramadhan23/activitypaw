package com.activity.activity.Pertemuan6;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Eko", "Kennedy");
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
