//Read two numbers from input (like A and B) and
// First prints all numbers between A and B (A and B not included), which are divisible to both 3 and 5.
// Then prints all numbers between A and B (A included by B not included), which are
// divisible by either 6 or 7. Finally prints all numbers between A and B (A and B both included), which are not
// divisible by 3.


package ca.ciccc.wmad.assignment2.question1;

import java.util.Scanner;
public class question1 {

    public static void divisibleNumberByThreeAndFive(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();

        int start = 0;
        int end = 0;

        if(num1 <= num2){
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        System.out.println("Divisible to both 3 and 5");
        for(int i = start +1; i < end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Divisible by either 6 or 7");
        for(int i = start; i < end; i++){
            if(i % 6 == 0 || i % 7 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Not divisible by 3");
        for(int i = start; i <= end; i++){
            if(i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
