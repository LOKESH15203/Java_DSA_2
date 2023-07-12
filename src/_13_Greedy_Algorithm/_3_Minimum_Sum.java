package _13_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_Minimum_Sum {

    public static void main(String[] args) {

        int C[] = {1, 2, 3};
        int D[] = {2, 1, 3};

        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min absolute diff of pairs = " + minDiff);

    }
}
