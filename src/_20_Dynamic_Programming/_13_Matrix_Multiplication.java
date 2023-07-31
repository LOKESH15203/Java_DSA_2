package _20_Dynamic_Programming;

public class _13_Matrix_Multiplication {

    // Recursion
    public static int mcmRec(int[] arr, int i, int j){
        if (i == j){        // Base case
            return 0;       // When only individual matrix are left to be multiplied.
        }
        int ans = Integer.MAX_VALUE;
        for (int k=i; k<j; k++){
            int cost1 = mcmRec(arr, i, k);      // start Ai....Ak
            int cost2 = mcmRec(arr, k+1, j);  // Ak+1....Aj end
            int cost3 = arr[i-1] * arr[k] * arr[j]; // = a * b * d => This is the cost to multiply the final result
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);           // To find the minimum of all cost of multiplying the matrices in multiple ways.
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;

        System.out.println(mcmRec(arr, 1, n-1));

    }

}
