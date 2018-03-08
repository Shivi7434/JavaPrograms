package com.shivalik;

public class Main {

    public static void main(String[] args) {
       int result = 1 + 2;
       System.out.println("1 + 2 = " + result);

       int previousResult = result;

       result = result - 1;
       System.out.println(previousResult + " - 1 = " + result);

       previousResult = result;
       result = result * 10;
       System.out.println(previousResult + " * 10 = " + result);

       previousResult = result;
       result = result / 5;
       System.out.println(previousResult + " / 5 = " + result);

       previousResult = result;
       result = result % 3;
       System.out.println(previousResult + " % 3 = " + result);

       previousResult = result;
       result = result + 1;
       System.out.println("Result is now " + result);
       result++;
       System.out.println("Result is now " + result);
       result--;
       System.out.println("Result is now " + result);

       result += 2;
       System.out.println("Result is now " + result);
       result *= 10;
       System.out.println("Result is now " + result);
       result -= 10;
       System.out.println("Result is now " + result);
       result /= 10;
       System.out.println("Result is now " + result);

       boolean isAlien = false;
       if (isAlien == true)
           System.out.println("It is not an alien");

       int topScore = 100;
       if (topScore >= 100)
           System.out.println("You got the high score");

       int secondTopScore = 81;
       if((topScore > secondTopScore) && (topScore > 100)) //wouldn't display as not met the condition
           System.out.println("Greater than second top score less than 100");

       if ((topScore > 90 ) || (secondTopScore <= 90 )) // as one of these is true
           System.out.println("One of these tests if true");
    }
}
