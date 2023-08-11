package com.activity.activity;

public class FactorialRecurcive {
    public static void main(String[] args) {
        
    }
    static int FactorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * FactorialRecursive(value - 1);
        }
    }
}
