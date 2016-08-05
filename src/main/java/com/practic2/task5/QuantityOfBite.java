package com.practic2.task5;

public class QuantityOfBite {

    public static int bitCounter(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(bitCounter(13));
    }
}
