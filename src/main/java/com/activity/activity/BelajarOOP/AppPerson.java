package com.activity.activity.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new Person();
        //Person person2 = new Person();

       // Person person3;
        //person3 = new Person();

        person.name = "Affan Ramadhan";
        person.address = "Kediri";
        // person.country = "Tidak bisa diubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        
        person.sayHello("Affan");
    }
}
