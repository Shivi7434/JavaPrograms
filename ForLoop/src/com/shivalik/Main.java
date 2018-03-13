package com.shivalik;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //for(init; termination; increment){ //when to intiate; when to exit the code; keep going until teminate condition met

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello");
        }
        for ( int i = 2; i < 9 ; i++){
            System.out.println("Interest amount is " + calculateInterest(10000.0, i ));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
