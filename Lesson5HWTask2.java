package com.lesson5;

public class Lesson5HWTask2 {

    public static void main(String[] args) {
        String roman = "MMDDXIV";
        System.out.println(toArabic(roman));
    }


    public static boolean isValid(String num) {

        for (int k = 0; k < num.length(); k++) {
            if (num.charAt(k) != 'I' &&
                    num.charAt(k) != 'V' &&
                    num.charAt(k) != 'X' &&
                    num.charAt(k) != 'L' &&
                    num.charAt(k) != 'C' &&
                    num.charAt(k) != 'D' &&
                    num.charAt(k) != 'M') {
                return false;
            }
        }
        return true;
    }


    public static String toArabic(String s) {

        if (isValid(s)) {

            int result = 0;
            int lastDigit = 0;
            int currentDigit = 0;

            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'I': {
                        currentDigit = 1;
                        break;
                    }
                    case 'V': {
                        currentDigit = 5;
                        break;
                    }
                    case 'X': {
                        currentDigit = 10;
                        break;
                    }
                    case 'L': {
                        currentDigit = 50;
                        break;
                    }
                    case 'C': {
                        currentDigit = 100;
                        break;
                    }
                    case 'D': {
                        currentDigit = 500;
                        break;
                    }
                    case 'M': {
                        currentDigit = 1000;
                        break;
                    }
                }


                if (lastDigit < currentDigit && lastDigit != 0) {
                    currentDigit -= lastDigit;
                    result -= lastDigit;
                    result += currentDigit;
                    lastDigit = currentDigit;
                    currentDigit = 0;
                } else {
                    lastDigit = currentDigit;
                    result += currentDigit;
                    currentDigit = 0;
                }
            }
            return String.valueOf(result);

        } else {
            return null;
        }
    }
}
