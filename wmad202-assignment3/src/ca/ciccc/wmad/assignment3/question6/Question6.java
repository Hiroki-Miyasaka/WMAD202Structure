package ca.ciccc.wmad.assignment3.question6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question6 {
    public ArrayList<Integer> searchDistinctNumber(int [] list){
        ArrayList<Integer> distinctList = new ArrayList<Integer>();
        for(int i = 0; i <= list.length - 1; i++){
            if(!distinctList.contains(list[i])){
                distinctList.add(list[i]);
            }
        }




        return distinctList;
    }
}
