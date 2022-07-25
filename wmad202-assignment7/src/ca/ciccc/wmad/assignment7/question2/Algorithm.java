package ca.ciccc.wmad.assignment7.question2;

public final class Algorithm {
//    public static <T> T max(T x, T y){
//        return x > y ? x : y;
//    }

    public static <T extends Comparable<T>> T max(T x, T y){
        return x.compareTo(y) == 1 ? x : y;
    }
}
