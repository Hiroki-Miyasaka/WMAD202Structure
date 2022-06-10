//Read a number in base 10 (any positive, non-decimal number, like 452), and convert it to binary
//and prints the results. (Please research yourself on how to convert a number in base 10 to a binary number).

package ca.ciccc.wmad.assignment2.question3;
import java.util.Scanner;

public class question3 {

    public static void convertToBinary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(Integer.toBinaryString(num));
    }

}
