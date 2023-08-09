package _1_Arrays;

public class _7_Best_TIme_to_Buy_Sell_Stock {

    // Inspired from Trap Rain Water - By me. - Not very optimised
    public static int maxProfit(int[] prices) {

        int n = prices.length;

        int afterMax[] = new int[n];
        afterMax[n-1] = prices[n-1];
        for (int i=n-2; i>=0; i--){
            afterMax[i] = Math.max(prices[i], afterMax[i+1]);
        }

        int maxProfit = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            int profit = afterMax[i] - prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }
}
