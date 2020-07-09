package com.joshuaivie.loopsAndArrays;

public class Array {

    public static void main(String[] args){

        float[] theVals = new float[10];
        float sum = 0.0f;

        for(var i = 1; (i-1) < theVals.length ; i++){
            var a = (i-1);
            theVals[a] = i * 2.0f;
            System.out.println(theVals[a]);
            sum += theVals[a];
        }

        System.out.println("The Sum is: " + sum);
    }
}
