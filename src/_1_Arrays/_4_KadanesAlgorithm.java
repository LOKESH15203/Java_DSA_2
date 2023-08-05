package _1_Arrays;

public class _4_KadanesAlgorithm {


    public static int kadanesAlgorithm(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadanesAlgorithm(array);
        System.out.println("Maximum subarray sum: " + maxSum); // Output: 6 (from subarray [4, -1, 2, 1])
    }
}