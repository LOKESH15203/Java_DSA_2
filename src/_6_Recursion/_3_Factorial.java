package _6_Recursion;

public class _3_Factorial {

    public static int factorial(int n){

        if(n== 0){   // 0! = 1
            return 1;
        }
//        int fnm1 = factorial(n-1); // These lines to analyze the Call stack
//        int fn = n * fnm1;
         return n * factorial(n-1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(6));


    }
}
