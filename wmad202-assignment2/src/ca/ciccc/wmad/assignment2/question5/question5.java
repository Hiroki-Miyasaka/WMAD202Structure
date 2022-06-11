/*
Create  a  package  called  problem2  and  inside  this  package,  create  a  Java  class  called  Problem2.
Write a Java program which receives a string from input and does the following:
• Reverse the string and print it
• Check whether the input string and the its reverse is the same (like BaBa). It considers
case-sensitivity which means (Baba and BaBa are not the same)
*/

package ca.ciccc.wmad.assignment2.question5;

import ca.ciccc.wmad.assignment2.problem2.Problem2;

public class question5 {
    public void invoke() {
        Problem2 problem2 = new Problem2();
        problem2.invoke("BaBaB");
    }
}
