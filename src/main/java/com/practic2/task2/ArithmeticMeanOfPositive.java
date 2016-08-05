package com.practic2.task2;

public class ArithmeticMeanOfPositive {

    private static int average(int a, int b) {
        if (a > 0 && b > 0)
            return (a + b) / 2;
        else {
            throw new NumberFormatException("Numbers must be positive");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("ArithmeticMean = " + average(4, 7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
