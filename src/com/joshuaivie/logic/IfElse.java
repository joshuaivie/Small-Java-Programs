package com.joshuaivie.logic;

public class IfElse {

    public static void main(String[] args){
        int value1 = 10;
        int value2 = 40;

        if (value1 > value2)
            System.out.println
                    ("Value 1 (" + value1 + ") is greater than Value 2 (" + value2 + ")");
        else if (value2 > value1)
            System.out.println
                    ("Value 2 (" + value2 + ") is greater than Value 1 (" + value1 + ")");
        else
            System.out.println
                    ("Value 1 and Value 2 are equal");
    }
}
