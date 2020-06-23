package com.joshuaivie.logic;

public class LogicalOperators {

    public  static  void  main(String[] args){
        int val1 = 32, val2 = -32, val3 = 0;
        int smallestValue = 0;


        if (val1 == val2 || val1 == val3 || val2 == val3)
            System.out.println("Can't resolve as we have equal variables");
        else if (val2 > val1 ^ val2 > val3){
            if (val1 > val3) smallestValue = val3;
            else smallestValue = val1;
        }
        else smallestValue = val2;

        System.out.println(smallestValue);
    }
}
