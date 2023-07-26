package _20_Dynamic_Programming;

public class _7_Longest_Common_Subsequence {

    public static int lcs(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }

        if (s1.charAt(n-1) == s2.charAt(m-1)){
            return lcs(s1, s2, n-1, m-1) + 1;
        }
        else{
            int ans1 = lcs(s1, s2, n-1, m);
            int ans2 = lcs(s1, s2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }



    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();

        System.out.println(lcs(str1, str2, n, m));
    }
}
