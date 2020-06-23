package com.joshuaivie.logic;

public class CalcEngine {

    public static void main(String[] args){

        double value1 = 10.00d;
        double value2 = -5.00d;
        float result = 0.00f;
        char operator = 'd';

        if (operator == 'a')  result = (float) (value1 + value2);
        else if (operator == 's') result = (float) (value1 - value2);
        else if (operator == 'm') result = (float) (value1 * value2);
        else if (operator == 'd') {
            if (value2 != 0) {
                result = (float) (value1 / value2);
            } else
                System.out.println("Sorry, we can't divide by zero");
        }
        else {
            System.out.println("The Operator supplied is invalid: " + operator);
            result = 0.00f;
        }

        System.out.println("Result is: " + result);
    }
}
