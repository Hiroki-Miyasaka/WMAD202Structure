package ca.ciccc.wmad.assignment3.question9;


import ca.ciccc.wmad.assignment3.question1.question1;

import java.util.*;

public class Question9 {
    public void invoke(){
        int[] list1 = {15, 19, 19, 11, 8, 7, 3, 3, 1};
        int index = 3;

        int getPrimeVisibility = getPrimeVisibility(list1, index);
        System.out.println("Prime Visibility for index " + index + " is " + getPrimeVisibility);

    }

    public static int getPrimeVisibility(int[] numbers, int index) {
        question1 q1 = new question1();
        if (index > numbers.length) {
            index = numbers.length;
        }

        int primeVisibilityCounter = 0;
        for (int i = 0; i < index; i++) {
            if (q1.searchPrimeNumber(numbers[i])) {
                primeVisibilityCounter++;
            }
        }
        return primeVisibilityCounter;
    }
}
