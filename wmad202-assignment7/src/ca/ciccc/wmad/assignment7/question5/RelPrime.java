package ca.ciccc.wmad.assignment7.question5;

import java.util.List;
import java.util.function.Predicate;

public class RelPrime {

    interface UnaryPredicate<T> extends Predicate<T> {}

    public static <T> int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p){

        for(int i = begin; i <= end; i++){
            T item = list.get(i);

            if(p.test(item)){
                return i;
            }
        }

        System.out.println("Thare is no number ...");
        return -1;
    }
}
