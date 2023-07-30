package _20_Dynamic_Programming;

public class _11_Catalan_Number {

    public static int catRec(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for (int i=0; i<n; i++){
            ans += catRec(i) * catRec(n-i-1);
        }
        return ans;
    }



    public static void main(String[] args) {

        int n = 30;
        int[] dp = new int[n+1];
        for (int i=0; i<dp.length; i++){
            dp[i] = -1;
        }


    }
}
