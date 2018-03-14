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
            System.out.println(" 10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i ))); //to correct 700.0000001 to 700.00
        }

        System.out.println("****************************");
        for ( int i = 8; i > 1 ; i--){
            System.out.println("Interest amount is " + calculateInterest(10000.0, i ));
            System.out.println(" 10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i ))); //to correct 700.0000001 to 700.00
        }
        //print out prime number using prime method given below
        int count = 0;
        for(int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a Prime Number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }
    public static boolean isPrime (int n ){
        int count = 0;
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) { //(int i = 2; i <= n/2; i++) instead of this code long AND MATH USED
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
