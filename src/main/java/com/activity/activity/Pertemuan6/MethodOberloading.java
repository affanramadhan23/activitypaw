package com.activity.activity.Pertemuan6;

public class MethodOberloading {
    
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstname) {
        System.out.println("Hello " + firstname);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello" + firstname + "" + lastname);
    }
}
