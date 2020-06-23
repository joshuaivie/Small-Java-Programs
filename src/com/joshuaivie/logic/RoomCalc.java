package com.joshuaivie.logic;

public class RoomCalc {
    public static void main(String[] args){

        int numberOfStudents = 256;
        int numberOfRooms = 40;

        if (numberOfRooms > 1 && numberOfStudents/numberOfRooms > 35) {
            System.out.println("This room is crowded");
    } else if (numberOfRooms < 1)
        System.out.println("Please select at least one room!");
        else
            System.out.println("Enjoy your room!");

        System.out.println();
        System.out.println("**** End of Program ****");
    }
}
