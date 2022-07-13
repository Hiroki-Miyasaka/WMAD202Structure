package ca.ciccc.wmad.assignment5.question2.question2_2;

import java.util.ArrayList;

public class Page {
    private ArrayList<String> words;

    public Page(ArrayList<String> words){
        this.words = words;
    }

    public ArrayList<String> getWords(){
        return this.words;
    }

    public int occurrance(String word){
        int count = 0;
        for(String item: this.words){
            if(item.equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }
}
