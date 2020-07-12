package com.joshuaivie.strings;

import java.util.Scanner;

public class StringCalcEngine {
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
        } else if (args.length == 1 && args[0].equals("interactive")){
            executeInteractively();
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
        double result = calculate(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner((System.in));
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = calculate(opCode, leftVal, rightVal);
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

    // Convert String operation to existing opcode
    static char opCodeFromString(String operationName){
        char opCode = operationName.charAt(0);
        return  opCode;
    }

    // Convert word string numbers to type double
    static double valueFromWord(String word){
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (var i = 0; i < numberWords.length; i++){
            if (word.equals(numberWords[i])){
                value = i;
                break;
            }
        }
        return value;
    }

}
