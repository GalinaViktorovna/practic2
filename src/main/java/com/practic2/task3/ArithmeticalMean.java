package com.practic2.task3;

public class ArithmeticalMean {
    private static int average(int a, int b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println("ArithmeticMean = " + average(-4, 7));
        System.out.println("ArithmeticMean = " + average(-4, -7));
    }
}
