package com.joshuaivie.loopsAndArrays;

public class ParallelArrayCalcEngine {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'm', 'a', 's'};
        double[] results = new double[opCodes.length];

        for (var i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = (rightVals[i] != 0) ? leftVals[i] / rightVals[i] : 0;
                    break;
                default:
                    System.out.println("Invalid Opcode: " + opCodes[i]);
                    results[i] = 0;
            }
        }

        for(double currentResult : results)
        System.out.println(currentResult);
    }
}
