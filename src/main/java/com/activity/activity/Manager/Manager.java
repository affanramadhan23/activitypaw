package com.activity.activity.Manager;

public class Manager {
    String name;

    void sayHell(String name) {
        System.out.println("Hello" + name + ", My Name is Manager " + this.name);
    }
}

class VicePresident extends Manager {
    void sayHello(String name) {
        
    }
}
