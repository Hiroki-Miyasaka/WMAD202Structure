package ca.ciccc.wmad.assignment7.question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class GenericList<E> {

    private ArrayList<E> list;

    public GenericList(){
        list = new ArrayList<>();
    }

    public void addItemToList(E item){
        this.list.add(item);
    }

    public void removeItemFromTheList(E item){
        this.list.remove(item);
    }

    public ArrayList<E> performOperation(Predicate<E> condition){
        ArrayList<E> results = new ArrayList<>();

        Iterator<E> iterator = list.iterator();

        while(iterator.hasNext()){
            E item = iterator.next();
            if(condition.test(item)){
                results.add(item);
            }
        }
        return results;
    }

}
