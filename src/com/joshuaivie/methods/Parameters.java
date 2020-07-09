package com.joshuaivie.methods;

public class Parameters {
    public static void main(String[] args){
    showSum(2.0f, 5.0f, 4);
    }

    static void showSum(float x, float y, int count){
        float sum = x + y;
        for (var i = 0; i < count; i++){
        System.out.println(sum);
        }

    }
}
