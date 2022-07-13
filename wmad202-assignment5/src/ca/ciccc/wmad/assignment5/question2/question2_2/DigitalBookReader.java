package ca.ciccc.wmad.assignment5.question2.question2_2;

import java.util.ArrayList;

public class DigitalBookReader {

    public static int getNumberOfOccurrence(Book book, String word){
        int total = 0;
        ArrayList<Page> pages = book.getPages();

        for(Page page: pages){
            total = total + page.occurrance(word);
        }
        return total;
    }
}
