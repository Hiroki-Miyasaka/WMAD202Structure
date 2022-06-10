package ca.ciccc.wmad.assignment2.question7;

import java.util.Scanner;

public class Question7 {
    public double findCircleAreaFromInsideSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int side = scanner.nextInt();

        return Math.PI*side*2;
    }
}
