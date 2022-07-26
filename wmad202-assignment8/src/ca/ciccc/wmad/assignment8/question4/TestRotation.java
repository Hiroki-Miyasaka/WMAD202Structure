package ca.ciccc.wmad.assignment8.question4;

import java.util.Arrays;

public class TestRotation {

    public static void test(){
        int[] array = {3, 8, 9, 7, 6};

        int[] rotatedArray = Rotation.solution(array, 5);
    }
    static class Rotation{
        public static int[] solution(int[] A, int K){

            for(int j = 0; j < K; j++){
                System.out.println();
                if(A.length > 1){
                    int[] B = A.clone();
                    A[0] = B[A.length - 1];
                    for(int i = 1; i < A.length; i++){
                        A[i] = B[i - 1];
                    }
                } else {
                    return A;
                }
            }
            return A;
        }
    }
}
