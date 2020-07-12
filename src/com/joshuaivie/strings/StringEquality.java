package com.joshuaivie.strings;

public class StringEquality {
    public static void main(String[] args) {
        String nameOne = "Joshua loves";
        nameOne += " you!";
        String nameTwo = "Joshua";
        nameTwo += " loves you!";

        if (nameOne == nameTwo) System.out.println(nameOne);
        else System.out.println("Oops, go read some more!");

        if (nameOne.equals(nameTwo)) System.out.println(nameOne + " You got this!");

        /* Weird option called interning takes the value of a string and stores in a intern group if the
        string does not already exist in the intern group and if it does it points the interned version.*/

        String nameThree = nameOne.intern();
        String nameFour = nameTwo.intern();

        if (nameThree == nameFour) System.out.println("Interning rocks");

    }
}
