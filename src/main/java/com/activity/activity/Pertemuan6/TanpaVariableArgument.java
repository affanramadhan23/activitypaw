package com.activity.activity.Pertemuan6;

public class TanpaVariableArgument {
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Lulus");
        }
    }
}
