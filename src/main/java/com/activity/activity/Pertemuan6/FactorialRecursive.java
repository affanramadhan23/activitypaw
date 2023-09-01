package com.activity.activity.Pertemuan6;

public class FactorialRecursive {
    static int Factorialrecursive(int value) {
        if (value ==1) {
            return 1;
        } else {
            return value * Factorialrecursive(value - 1);
        }
    }
}
