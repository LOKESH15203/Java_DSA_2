package _13_Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class _4_Max_Len_of_Chain_of_pair {

    public static void main(String[] args) {

        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // End of 1st pair

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum Length of chain is : " + chainLen);
    }
}