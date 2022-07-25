package ca.ciccc.wmad.assignment7.question5;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion5 {

    public TestQuestion5(){
    }

    public static void test(){

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(11);
        list.add(23);
        list.add(35);
        list.add(22);
        list.add(7);
        list.add(9);

        int begin = 0;
        int end = 3;

        class CustomPredicate implements RelPrime.UnaryPredicate<Integer>{

            @Override
            public boolean test(Integer number) {
                for(int i = begin; i <= end; i++){
                    int num1 = number, num2 = list.get(i), gcd = 1;
                    for(int j = 1; j <= num1 && j <= num2; j++){
                        if(number!=num2){
                            if(num1 % j == 0 && num2 % j == 0)
                                gcd = j;
                        }
                    }
                    if(gcd != 1){
                        return false;
                    }
                }
                return false;
            }
        }
    }
}
