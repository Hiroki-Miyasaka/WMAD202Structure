package ca.ciccc.wmad.assignment7.question1;

import java.util.ArrayList;

public class TestQuestion1 {

    public void run () {
         Book book1 = new Book("a", 300, 1234);
        Book book2 = new Book("b", 400, 1235);
        Book book3 = new Book("c", 100, 1238);
        ArrayList<Book> arrayList = new ArrayList<>();

        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);

        ArrayList<String> dummyList = new ArrayList<>();

        System.out.println(Generic.countNumberOfElementsWithSpecificProperty(arrayList));

//        Generic.countNumberOfElementsWithSpecificProperty(dummyList);

    }
}
