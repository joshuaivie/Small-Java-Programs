package com.joshuaivie.logic;

public class SwitchCalcEngine {
    public static void main(String[] args) {
        int value1 = 50, value2 = 4, result;
        char opCode = 'a';

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm' :
                result = value1 * value2;
                break;
            case 'd':
                result = (value2 != 0 ) ? value1/value2 : 0;
                break;
            default:
                System.out.println("Invalid Opcode: " + opCode);
                result = 0;
        }

        System.out.println(result);
    }
}
