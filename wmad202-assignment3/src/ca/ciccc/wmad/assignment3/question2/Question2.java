package ca.ciccc.wmad.assignment3.question2;

import ca.ciccc.wmad.assignment3.question1.question1;

public class Question2 {

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
