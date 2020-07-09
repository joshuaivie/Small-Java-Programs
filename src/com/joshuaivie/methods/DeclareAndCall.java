package com.joshuaivie.methods;

public class DeclareAndCall {

    public static void main(String[] args){
        System.out.println("Before Print");
        doSSomething();
        System.out.println("After Print");
    }
    static void doSSomething(){
        System.out.println("Inside a Method");
        System.out.println("Still inside a Method");
    }
}
