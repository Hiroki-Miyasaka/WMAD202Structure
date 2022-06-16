package ca.ciccc.wmad.assignment3.question4;

import java.util.Arrays;

public class Question4 {
    public static int searchMultipleNumbers(int [] duplicateArray){
        int duplicateNum = 0;
        int count = 0;
        int temp = 0;
        Arrays.sort(duplicateArray);
        for(int i = 0; i < duplicateArray.length - 1; i++){
            if(duplicateArray[i] == duplicateArray[i+1]){
                temp += 1;
            } else if(duplicateArray[i] != duplicateArray[i+1] && temp > count){
                count = temp;
                duplicateNum = duplicateArray[i];
                temp = 0;
            }
        }
        return duplicateNum;
    }
}
