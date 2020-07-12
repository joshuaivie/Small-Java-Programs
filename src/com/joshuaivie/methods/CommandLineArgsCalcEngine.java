package com.joshuaivie.methods;

public class CommandLineArgsCalcEngine {
    public static void main(String[] args){
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'm', 'a', 's'};
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (var i = 0; i < opCodes.length; i++) {
                results[i] = calculate(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 3) {
            handleCommandLineArg(args);
        } else {
            System.out.println("Please supply and opcode and two numbers");
        }
        }

    private static void handleCommandLineArg(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = calculate(opCode, leftVal,rightVal);
        System.out.println(result);
    }


    static double calculate(char opCode, double leftVal, double rightVal){
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = (rightVal != 0) ? leftVal / rightVal : 0;
                break;
            default:
                System.out.println("Invalid Opcode: " + opCode);
                result = 0;
        }
        return result;
    }
}
