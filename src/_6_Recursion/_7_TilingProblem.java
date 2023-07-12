package _6_Recursion;

public class _7_TilingProblem {

    public static int tiling(int n){ // 2 * n
        if (n==0 || n==1){ // if "n = 0" no tile required hence that is also one way by not placing a single tile.
            return 1;
        }
        // Vertically placed
        int fnm1 = tiling(n-1);

        // Horizontally placed
        int fnm2 = tiling(n-2);

        return fnm1+fnm2;
    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println("Total No. of ways tiles can be arranged for height 2 and width "+ n+  " are "+tiling(3));

        /*
        n = 2      ways = 2
        n = 1      ways = 1
         */
    }
}
