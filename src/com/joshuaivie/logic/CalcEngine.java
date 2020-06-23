package com.joshuaivie.logic;

public class CalcEngine {

    public static void main(String[] args){

        double value1 = 10.00d;
        double value2 = 5.00d;
        float result = 0.00f;
        char operator = 'm';

        if (operator == 'a')  result = (float) (value1 + value2);
        else if (operator == 's') result = (float) (value1 - value2);
        else if (operator == 'm') result = (float) (value1 * value2);
        else if (operator == 'd') result = (float) (value1 / value2);
        else result = 0.00f;

        System.out.println(result);
    }
}
