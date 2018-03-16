package com.shivalik;

public class Main {

    public static void main(String[] args) {
//        int count =1;
////        while(count !=5){
////            System.out.println("Count value is " + count);
////            count++;
////        }
//        //for the for loop which give same results
//        //for ( count = 1; count < 6; count++) {
//            //System.out.println("Count value is " + count);
//       // }
//
//        count = 1;
////        while(true) {
////            if(count == 6){
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        }while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber ){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber ) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
        }
            System.out.println("Total even number found " + evenNumberFound);


    }

    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0){
            return true;
        }else {
            return false;
        }

    }
}
