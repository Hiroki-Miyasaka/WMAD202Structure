package ca.ciccc.wmad.assignment7.question4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestQuestion4 {

    public static void test() {
        GenericList<String> list1 = new GenericList<>();
        list1.addItemToList("Hello");
        list1.addItemToList("This");
        list1.addItemToList("is");
        list1.addItemToList("Java");
        list1.addItemToList("Programming");

        class StringCondition implements Predicate<String>{

            @Override
            public boolean test(String s){
                if(s.contains("o")){
                    return true;
                }
                return false;
            }
        }

        ArrayList<String> result1 = list1.performOperation(new StringCondition());

//        ArrayList<String> result1 = list1.performOperation(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if (s.contains("o")) {
//                    return true;
//                }
//                return false;
//            }
//        });

        for (String s : result1) {
            System.out.println(s);
        }
    }
}
