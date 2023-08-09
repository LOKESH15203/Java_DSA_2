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

    // Done in Alpha Course and LEETcode's best Solution  -- Optimised Code
    public static int leetProfit(int[] prices){
            int lsf = Integer.MAX_VALUE; // least so far
            int op = 0; // overall profit
            int pist = 0; // profit if sold today

            for(int i = 0; i < prices.length; i++){
                if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                    lsf = prices[i]; // update our least so far
                }
                pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
                if(op < pist){ // if pist is more then our previous overall profit
                    op = pist; // update overall profit
                }
            }
            return op; // return op
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }
}
