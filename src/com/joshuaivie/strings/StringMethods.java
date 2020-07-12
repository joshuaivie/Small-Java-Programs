package com.joshuaivie.strings;

public class StringMethods {
    public static void main(String[] args) {
        int iValue = 100;
        String sValue = String.valueOf(iValue);
        System.out.println(sValue);

        // Converting Non-String `
        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println(output);
    }
}
