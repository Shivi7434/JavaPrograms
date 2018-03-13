package com.shivalik;

public class Main {


    public static void main(String[] args) {
        boolean game = true;
        int speed = 100;
        int distance = 25;
        int laps = 6;

        if (speed >= 100)
            System.out.println("Speed less than " + speed + " for " + distance + " miles");
        if (speed >= 500)
            System.out.println("Speed less than " + speed);

        if (game) {
            int totalDistance = distance * laps;
            System.out.println("Distance Covered " + totalDistance + " miles");

        }

        String name = "Tim";
        switch(name) {
            case "Tim":
                System.out.println("Tim" );
                break;

            case "Carrie":
                System.out.println("Carrie");
                break;

            default:
                System.out.println("Someone Else  "); //to find how to use string in switch
                break;
        }
    }
}
