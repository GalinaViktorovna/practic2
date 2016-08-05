package com.practic2.task7;

public class SumOfUnsignedNumber {

    public static void toCalculate(String first, String second) {
        int a = Integer.parseInt(first, 2);
        int b = Integer.parseInt(second, 2);
        System.out.println(Integer.toBinaryString(a + b));

    }

    public static void main(String[] args) {
        toCalculate("101", "100");
    }
}
