package ca.ciccc.wmad.assignment2.main;
import ca.ciccc.wmad.assignment2.question1.question1;
import ca.ciccc.wmad.assignment2.question2.question2;
import ca.ciccc.wmad.assignment2.question3.question3;
import ca.ciccc.wmad.assignment2.question4.question4;
import ca.ciccc.wmad.assignment2.question5.question5;
import ca.ciccc.wmad.assignment2.question6.Question6;
import ca.ciccc.wmad.assignment2.question7.Question7;
import ca.ciccc.wmad.assignment2.question8.Question8;
import ca.ciccc.wmad.assignment2.question9.Question9;
import ca.ciccc.wmad.assignment2.question10.Question10;

import java.util.Scanner;


public class Assignment2Driver {
    public static void run(){
        boolean stop = true;
        while (stop){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter question number 1-10 to show result of question");
            int question = scanner.nextInt();
            if (question == 1){
                question1 q1 = new question1();
                q1.divisibleNumberByThreeAndFive();
                stop = false;
            }else if(question == 2){
                question2 q2 = new question2();
                int original = q2.keepAsking();
                System.out.println(q2.reversedNumber(original));
                stop = false;
            }else if(question == 3){
                question3 q3 = new question3();
                q3.convertToBinary();
                stop = false;
            }else if(question == 4){
                question4 question4 = new question4();
                question4.stopInvalid();
                stop = false;
            }else if(question == 5){
                question5 question5 = new question5();
                question5.invoke();
                stop = false;
            }else if(question == 6){
                Question6 question6 = new Question6();
                question6.invoke();
                stop = false;
            }else if(question == 7){
                Question7 question7 = new Question7();
                System.out.println("Area of Circle = " + question7.findCircleAreaFromInsideSquare());
                stop = false;
            }else if(question == 8){
                Question8 question8 = new Question8();
                question8.monteCarlo();
                stop = false;
            }else if(question == 9){
                Question9 question9 = new Question9();
                question9.invoke();
                stop = false;
            }else if(question == 10){
                Question10 question10 = new Question10();
                question10.invoke();
                stop = false;
            }else {
                System.out.println("Please enter btw 1-10");
            }
        }
    }
}
