package com.shivalik;
//changing number of parameters to make method(with same name) unique
public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim",  500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calFeetandInchesToCentimeters(6 , 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calFeetandInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No Player, No score");
        return 0;
    }

    public static double calFeetandInchesToCentimeters(double feet, double inches){

        if((feet < 0) || ((inches < 0 ) || (inches > 12 ))) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12)* 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet," + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calFeetandInchesToCentimeters(double inches){
        if(inches < 0 ) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches ");
        return calFeetandInchesToCentimeters(feet , remainingInches);
    }
}
