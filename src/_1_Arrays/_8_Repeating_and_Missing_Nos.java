package _1_Arrays;
import java.util.Arrays;
public class _8_Repeating_and_Missing_Nos {

    /*
    You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.

Example:
Input:[3 1 2 5 3]
Output:[3, 4]
A = 3, B = 4
     */

    /*
    Sum(Actual) = Sum(1...N) + A - B
    Sum(Actual) - Sum(1...N) = A - B.
    Sum(Actual Squares) = Sum(1^2 ... N^2) + A^2 - B^2
    Sum(Actual Squares) - Sum(1^2 ... N^2) = (A - B)(A + B)
    = (Sum(Actual) - Sum(1...N)) ( A + B).
We can use the above 2 equations to get the value of A and B.
     */

    public static int[] repMissNos(int[] arr){
        Arrays.sort(arr);
        int[] res = new int[2];
        int n= arr.length;
        int rep = -1;
        int miss = -1;
        int sum = arr[0];

        for (int i=1; i<n; i++){
            if (arr[i] == arr[i-1]){
                rep = arr[i];
            }
            sum += arr[i];
        }

        miss = (n * (n+1)/2 - sum + rep);
        res[0] = rep;
        res[1] = miss;
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(repMissNos(arr)[0]);
        System.out.println(repMissNos(arr)[1]);
    }
}
