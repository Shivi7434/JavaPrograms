package com.shivalik;

public class Main {

    public static void main(String[] args) {
        int count =1;
        while(count !=5){
            System.out.println("Count value is " + count);
            count++;
        }
        //for the for loop which give same results
        //for ( count = 1; count < 6; count++) {
            //System.out.println("Count value is " + count);
       // }

        count = 1;
        while(true) {
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
    }
}
