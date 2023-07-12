package _6_Recursion;

public class _4_FibonacciSeries {

    public static int fibonacci(int n){
        // We have 2 known Base cases as Fibonacci Sequence always starts with
        // 0 1  and then 1 2 3 5 8...    i.e.     0 1 1 2 3 5 8
        if( n==0 || n==1 ){
            return n;
        }
//        if (n==1){
//            return 1;
//        }
        // F(n) = F(n-1) + F(n-2)    i.e. F(4) = F(3) + F(2)

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
