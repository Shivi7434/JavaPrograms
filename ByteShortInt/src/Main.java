public class Main {
    //datatype based on whole number
    public static void main(String[] args) {
        // has a width of 32
        //int myMinValue = -2_147_483_648; //int is used when more space is available
        //int myMaxValue = 2_147_483_647;
        // has a width of 8
        //byte myByteValue = -128; //allocated for much smaller amount of space largest number that can fit is 127
        // has a width of 16
        //short myshortValue = -32768; // largest no. can be stored is 32767


        //long has a width of 64
        //long myLongValue = 9_223_372_036_854_775_807L; // can store a huge number


        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
     }
}
