package com.joshuaivie.loopsAndArrays;

public class DoWhile {
    public static void main(String[] args){

        int i = 5, initial = 0;

        do {
            initial += i;
            i++;
            i++;
        }while (i <= 25);
        System.out.println(initial);
    }
}
