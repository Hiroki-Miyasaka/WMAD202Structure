package ca.ciccc.wmad.assignment3.question1;


import java.util.Scanner;

public class question1 {
    public static boolean searchPrimeNumber(int num){

        if(num <= 1) return false;
        if(num == 2) return true;

        for(int i = 2; i <= num -1; i++ ){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int takeNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        return num;
    }
}
