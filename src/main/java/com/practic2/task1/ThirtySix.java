package com.practic2.task1;

public class ThirtySix {
    private static char[] arrayThirtySix = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};

    private static int size = 36;

    public static void calculate(char first, char second) {
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < arrayThirtySix.length; i++) {
            if (arrayThirtySix[i] == first) {
                firstIndex = i;
            }
            if (arrayThirtySix[i] == second) {
                secondIndex = i;
            }
        }
        int newIndex = firstIndex + secondIndex;
        if (newIndex > size-1) {
            int tempIndex = newIndex /size;
            int lastIndex = newIndex % size;
            System.out.println("" + tempIndex + arrayThirtySix[lastIndex]);
        } else {
            int lastIndex = newIndex % size;
            System.out.println("" + arrayThirtySix[lastIndex]);
        }
    }

    public static void main(String[] args) throws Exception {
        ThirtySix.calculate('9', '1');
        ThirtySix.calculate('z','1');
        ThirtySix.calculate('r','z');
    }
}

