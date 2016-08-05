package com.practic2.task4;

public class TheNumberOfLetters {
    public static void toConvert(String cryptNumber) {
        String letters = "abcdefghij";
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < cryptNumber.length(); i++) {
            numbers.append(letters.indexOf(cryptNumber.charAt(i)));
        }
        try {
            System.out.print("Number unlocked: ");
            for (char number : numbers.toString().toCharArray()) {
                System.out.print(number);
            }
            System.out.println();
        } catch (NumberFormatException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        toConvert("abcd");
    }
}
