package com.practic2.task6;

public class InsertZero {
    public static int toInsert(int number, int position) {

        String binaryString = Integer.toBinaryString(number);
        char[] bits = binaryString.toCharArray();

        if ((position >= 1) && (position <= bits.length)) {
            bits[bits.length - position] = '0';
        }
        if (number < 0) {
            bits[0] = '0';
            binaryString = String.valueOf(bits);
            return Integer.parseInt(binaryString, 2) * (-1) - 2;
        }
        binaryString = String.valueOf(bits);
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        System.out.println(toInsert(6, 2));
    }
}



