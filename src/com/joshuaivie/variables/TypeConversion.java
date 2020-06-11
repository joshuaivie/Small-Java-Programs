package com.joshuaivie.variables;

public class TypeConversion {

    public static void main(String[] args){
        float floatVal = 0.1f;
        double doubleVal = 0.4d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        // Done using the CAST operator
        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;

        System.out.println("Success");
    }
}
