//Using  Java,  write  a  program  which  reads  a  number  from  the  input  (like  123).  You  make  the
//assumption that the user does not enter a decimal number (like 123.4). The number entered by the
//user should not be divisible by 10 and if the user enters a number that is divisible by 10 (like 560),
//it is considered invalid and the application should keep asking until the user enters a valid input.
//Once the user enters a valid input, the program calculates the reverse of the number (for 153, the
//reverse is 351) and prints the result.


        package ca.ciccc.wmad.assignment2.question2;
import java.util.Scanner;

public class question2 {
    public static int keepAsking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        while(num % 10 == 0){
            System.out.println("Enter a number: ");
            num = scan.nextInt();
        }
        return num;
    }

    public static String reversedNumber(int num){
        String reversedNum = "";
        while(num >= 10){
            reversedNum += String.valueOf(num % 10);
            num = num / 10;
        }
        return reversedNum + String.valueOf(num);
    }
}
