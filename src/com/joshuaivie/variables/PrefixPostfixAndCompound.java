package com.joshuaivie.variables;

public class PrefixPostfixAndCompound {

    public static  void main(String[] args){

        System.out.println("--- PRE FIX ---");

        //Prefix Applied Before
        int someVale = 5;
        System.out.println(++someVale);
        System.out.println(someVale);


        System.out.println("--- POST FIX ---");

        //Postfix Applied After
        int someOtherValue = 5;
        System.out.println(someOtherValue++);
        System.out.println(someOtherValue);


        System.out.println("--- COMPOUND OPERATORS ---");

        //Compound Operators Assign answer to variable
        // ( += , -= , *= , /= , %= )
        int myValue = 50;
        myValue -= 5;
        System.out.println(myValue);

        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;
        myOtherValue /= val1 * val2;
        System.out.println(myOtherValue);

    }
}
