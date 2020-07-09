package com.joshuaivie.loopsAndArrays;

public class While {
    public static void main(String[] args){

        int num = 5;
        int factorial = 1;

        while ( num > 1 ){
            factorial *= num;
            num--;
        }

        System.out.println(factorial);
    }
}
