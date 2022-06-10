//The program keeps asking the user to enter numbers (positive or negative) until the user enters an
//invalid input. (An invalid input is an input which includes at least one alphabet, like 123d4). The
//program should print the Max and Min of the numbers the user had entered as well as the distance
//between the Max and Min. (Remember to calculate the absolute distance)


package ca.ciccc.wmad.assignment2.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class question4 {

    public void stopInvalid(){

        List<Integer> numbers = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter only number no invalid please : ");
            try {
                int check = scanner.nextInt();
                numbers.add(check);
            }catch (Exception e){
                int max = Collections.max(numbers);
                int min = Collections.min(numbers);
                int diff = max-min;
                System.out.println("list of entered numbers: " + numbers);
                System.out.println("Max of entered numbers : "+ max);
                System.out.println("Min of entered numbers : "+ min);
                System.out.println("Distance of entered numbers : "+ diff);
                break;
            }

        }
    }
}
