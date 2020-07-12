package com.joshuaivie.strings;

public class StingBuilder {
    public static void main(String[] args) {
        String location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder();
        sb.append("I flew to ").append(location).append(" on flight #").append(flightNumber);
        String message = sb.toString();
        System.out.println(message);

        double time = 9.00d;
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at ").insert(pos + 4, time).insert(pos + 7, "am");
        String newMessage = sb.toString();
        System.out.println(newMessage);
    }
}
