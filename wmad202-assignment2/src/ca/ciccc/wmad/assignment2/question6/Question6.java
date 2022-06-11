/*
The Java program receives a statement which contains only alphabet variables and binary
operations including +, -, *, / and % and check whether the statement is a valid arithmetic
statement or not.

• The statement might contain parenthesis as well. For instance:
• a+b*a+c/c%y
• (a+b)*(a/d-(a/b))

• You can make this assumption that the variable names contain only one alphabet
(like a, b, c) and cannot have more than one alphabet (like ab, temp, sum, ...)
• Note: Such an statement is valid if two conditions are met at the same time:
o 1- Number of open and close parenthesise in the statement is the same.
o 2- At any point (character or index) of the statement, number of the open
parenthesise is bigger than or equal the number of close parenthesise.

 */



package ca.ciccc.wmad.assignment2.question6;

import java.util.Scanner;

public class Question6 {
    public void invoke(){
        boolean stopAsking = true;
        while (stopAsking){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a statement : ");
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++){
                if(!(input.length() == i + 1)){
                    if(Character.isAlphabetic(input.charAt(i))){
                        if(Character.isAlphabetic(input.charAt(i+1))){

                            if(input.charAt(i) == '('){
                                if(input.charAt(i+1) == '('){
                                    stopAsking = true;
                                }
                            }else if(input.charAt(i) == ')'){
                                if(input.charAt(i+1) == ')'){
                                    stopAsking = true;
                                }
                            }else {
                                stopAsking = false;
                                System.out.println("There is multiple char");
                            }
                        }
                    }
                }
            }
            System.out.println("input : "+ input);
        }
    }

}
