package com.activity.activity.Pertemuan6;

public class FactorialLoop {
    public static void main(String[] args) {
        
    }

    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
