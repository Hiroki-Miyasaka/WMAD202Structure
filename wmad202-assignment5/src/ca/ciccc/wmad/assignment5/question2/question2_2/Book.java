package ca.ciccc.wmad.assignment5.question2.question2_2;

import java.util.ArrayList;

public class Book {

    private ArrayList<Page> pages;

    public Book(ArrayList<Page> pages){
        this.pages = pages;
    }

    public ArrayList<Page> getPages(){
        return this.pages;
    }
}
