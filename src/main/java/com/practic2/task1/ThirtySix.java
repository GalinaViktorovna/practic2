package com.practic2.task1;

public class ThirtySix {
    private final static String THIRTYSIX = "0123456789abcdefghijklmnopqrstuvwxyz";

    public static String calculate(String input) {
        String[] numbers = input.split(",");
        long sum = 0;
        long count = 0;
        for (String number : numbers) {
            for (char s : number.toCharArray()) {
                count += THIRTYSIX.indexOf(s);
                System.out.println(THIRTYSIX.indexOf(s));
                count *= 36;
            }
            sum += count/36;
            count = 0;
        }
        return Long.toString(sum, 36);
    }
    public static void main(String[] args) {
        System.out.println("What we have: " + calculate("12,2"));
    }
}

