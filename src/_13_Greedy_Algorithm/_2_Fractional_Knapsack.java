package _13_Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class _2_Fractional_Knapsack {

    /*
    What is done here is
    * 2D array is created to store idx and ratio(value/weight)
    * Then it is sorted in descending order to bring the high ratio i.e. high value & low weight products
    * Then if bag has capacity to add the entire new object then add it from the start of the sorted array
    * If space is less, then add fractional part of the product because it is high value.
    * */


    public static void valueSack(int[] value, int[] weight, int maxW){

        double ratio[][] = new double[value.length][2];
        // 0th col => index , 1st col => ratio;

        for(int i = 0; i< value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));
        //                           Sorting on the basis of *1st* column i.e. ratio

        int capacity = maxW;
        int finalV = 0;
        for(int i=ratio.length-1; i>=0; i--){       // Above sorting sorts the Array in ascending order. Hence, in order to get the highest valur product first, we need to access the array in opposite direction.
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {      // Space available in the Knapsack
                finalV += value[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalV += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("The maximum value is : " + finalV);
    }

    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        valueSack(value, weight, 50);
    }
}
