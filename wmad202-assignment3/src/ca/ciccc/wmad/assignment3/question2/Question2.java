//Design and implement a function with one parameter which is a positive integer and -
//finds the next prime number which is bigger than the given input parameter and returns
//it. Reuse (call) the method you have defined for Problem 1 (above).


package ca.ciccc.wmad.assignment3.question2;

import ca.ciccc.wmad.assignment3.question1.question1;

public class Question2 {

    /**
     *finds the next prime number bigger than the given number
     * @param number: A given number to generate a prime number which is bigger than the given number
     * @return next prime number
     */
    public static int searchBiggerPrimeNumber(){
    question1 q1 = new question1();
    int num = q1.takeNumber();
    int max = Integer.MAX_VALUE;

    for(int i = num + 1; i <= max; i++){
        if(q1.searchPrimeNumber(i)) return i;
    }
    return -1;
    }
}
