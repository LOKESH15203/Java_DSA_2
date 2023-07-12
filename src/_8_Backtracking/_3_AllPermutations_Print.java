package _8_Backtracking;

public class _3_AllPermutations_Print {

    public static void printPermutations(String str,String ans){

        // Base Case
        // As we are removing elements from the string
        if(str.length()== 0)
            System.out.println(ans);


        // Work
        for(int i = 0; i< str.length(); i++){
            char crr = str.charAt(i);
            // Remove the element that will be added to the ans
            // "abcde" = "ab" + "de"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(NewStr, ans + crr);
        }
    }

    public static void main(String[] args) {

        String str = "abc";
        printPermutations(str, "");

    }
}