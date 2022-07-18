package ca.ciccc.wmad.assignment7.question1;

import java.util.ArrayList;

public class Generic {

//    private T t;
//    private ArrayList<T> elements;
//
//    public Generic(T t, ArrayList<T> elements) {
//        this.t = t;
//        this.elements = elements;
//    }

    public static <T extends CheckValid> int countNumberOfElementsWithSpecificProperty(ArrayList<T> elements){
        int count = 0;

        for(T item: elements){
            if(item.test()){
                count++;
            }
//            if(item > t){
//                count++;
//            }
        }
        return count;
    }
}


