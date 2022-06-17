package ca.ciccc.wmad.assignment3.question5;


import java.util.Arrays;

public class Question5 {
    public static void countDuplicateNumber(int [] duplicateArray){
        int ArrayTable[] = new int[99];
        for(int i = 0; i <= ArrayTable.length - 1; i++){
            ArrayTable[i] = 0;
        }
        for(int i = 0; i <= duplicateArray.length - 1; i++){
            ArrayTable[duplicateArray[i] - 1] += 1;
        }
        for(int i = 0; i <= ArrayTable.length - 1; i++){
            System.out.println(i+1 + " is " + ArrayTable[i]);
        }
    }
}
