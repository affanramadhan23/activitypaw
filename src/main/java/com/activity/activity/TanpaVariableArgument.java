package com.activity.activity;

public class TanpaVariableArgument {
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalvalue = total / values.length;

        if (finalvalue >= 75) {
            System.out.println("Selamat " + name + ",Anda Lulus");
        } else {
            System.out.println("Maaf" + name + ", Anda Lulus");
        }
    }
}