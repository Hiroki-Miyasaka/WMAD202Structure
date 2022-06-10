package ca.ciccc.wmad.assignment2.question9;

import java.util.Locale;
import java.util.Scanner;

public class Question9 {
    public void invoke(){
        boolean stopAsking = true;
        boolean containNumber = false;
        while (stopAsking){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name without number : ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++){
                if(Character.isDigit(input.charAt(i))){
                    stopAsking = false;
                    containNumber = true;
                }
            }
            if(!containNumber){
                System.out.println(input.toUpperCase(Locale.ROOT));
            }
        }
    }
}
