package ca.ciccc.wmad.assignment3.main;

import ca.ciccc.wmad.assignment3.question1.question1;
import ca.ciccc.wmad.assignment3.question2.Question2;
import ca.ciccc.wmad.assignment3.question3.Question3;
import ca.ciccc.wmad.assignment3.question4.Question4;

public class Assignment3Driver {
    public static void run(){
//        question1 q1 = new question1();
//        int numQ1 = q1.takeNumber();
//        System.out.println(q1.searchPrimeNumber(numQ1));

//        Question2 q2 = new Question2();
//        System.out.println(q2.searchBiggerPrimeNumber());

//        Question3 q3 = new Question3();
//        q3.shapeFunction(7, "SHAPE3");

        Question4 q4 = new Question4();
        System.out.println(q4.searchMultipleNumbers(new int[]{1, 4, 5, 6, 6, 6, 4, 5, 6, 5}));
    }
}
