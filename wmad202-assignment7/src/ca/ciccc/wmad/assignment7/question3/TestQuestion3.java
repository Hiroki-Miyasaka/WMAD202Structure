package ca.ciccc.wmad.assignment7.question3;

public class TestQuestion3 {

    public static void test(){
        String[] array1 = {"A", "B", "C", "D", "E", "F"};
        GenericExchange.exchangeElements(array1, 2, 5);

        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
    }
}
