package _0_TP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _ArrayFIll {

    public static void main(String[] args) {
        int[] ans = new int[4];
        Arrays.fill(ans, 1);
        for (int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
