package com.lesson5;

public class Lesson5HWTask1 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("BlahalB"));
        System.out.println(isPalindrome("FdfdfdfF"));
    }

    public static boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return (s.equals(reverse));
    }
}
