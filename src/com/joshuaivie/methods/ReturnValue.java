package com.joshuaivie.methods;

public class ReturnValue {
    public static void main(String[] args) {
        double result = calculateInterest(200d, 10.0d, 5);
        double[] resultBreakdown = produceInterestHistory(200d, 10d, 5);
        System.out.println("The result is : " + result);
        System.out.println("-----------------------");

        for (double r: resultBreakdown) System.out.println(r);

    }

    static double calculateInterest(double amt, double rate, int years){
        return amt * rate * years;
    }

    static double[] produceInterestHistory(double amt, double rate, int years){
        double[] accumulatedInterest = new double[years];

        for( var yearIndex = 0; yearIndex < years; yearIndex++){
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = (amt * rate * year);
        }
        return accumulatedInterest;
    }
}
