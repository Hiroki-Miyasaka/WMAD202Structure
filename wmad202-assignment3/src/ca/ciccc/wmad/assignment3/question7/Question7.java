package ca.ciccc.wmad.assignment3.question7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    /**Define and implement a function which does Linear Search. This function receives two
     input parameters, one is a list of integers and the other one is a number to search for. The
     method returns -1 (negative one) if the number (the second parameter of the function)
     does not exist in the list or returns the index of the number if the number exists in the list.
     -If there are more than one occurrence of the number, the function will return the index of
     the first occurrence*/
    public static int searchNumber(ArrayList<Integer> arrayL, int Number) {
        int x = -1;
        if (arrayL.contains(Number)) {
            x = arrayL.indexOf(Number);
        }
        return x;
    }
    public static void takeNumbers(){
        System.out.println("Question7");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        System.out.println("Please enter one number to find: ");
        int searchNumber = scanner.nextInt();

        if(searchNumber(numberList, searchNumber) == -1) {
            System.out.println(-1);
        } else {
            System.out.println("Index:" + searchNumber(numberList, searchNumber));
        }
    }
}