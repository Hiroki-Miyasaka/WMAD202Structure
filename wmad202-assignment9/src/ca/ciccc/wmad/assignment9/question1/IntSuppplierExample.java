package ca.ciccc.wmad.assignment9.question1;

import java.util.function.IntSupplier;

public class IntSuppplierExample {
    public static void test(){
        IntSupplier is = () -> {
            int a = 5;
            int b = 6;
            return a * b;
        };
        System.out.println(is.getAsInt());
    }
}
