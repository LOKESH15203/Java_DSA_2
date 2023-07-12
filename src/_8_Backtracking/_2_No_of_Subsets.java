package _8_Backtracking;

public class _2_No_of_Subsets {

    public static void subStrings(String str, String ans, int i){

        // base case
        if(i == str.length()){
            if(ans.length() == 0)
                System.out.println("Nulla");

            else
                System.out.println(ans);

            return;
        }

        // Recursion

        // if Yes
        subStrings(str, ans+str.charAt(i), i+1);

        // if No
        subStrings(str, ans, i+1);
    }

    public static void main(String[] args) {

        String str = "abc";
        subStrings(str, "", 0);

    }
}
