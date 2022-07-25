package ca.ciccc.wmad.assignment7.question3;

public class GenericExchange {

    public static <E> void exchangeElements(E[] array, int position1, int position2){

        if(position1 < array.length && position2 < array.length){
            E item1 = array[position1];
            array[position1] = array[position2];
            array[position2] = item1;
        } else{
            System.out.println("Position or Position2 is wrong");
        }
    }
}
