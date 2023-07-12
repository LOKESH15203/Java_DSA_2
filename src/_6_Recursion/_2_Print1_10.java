package _6_Recursion;

public class _2_Print1_10 {

    public static void print(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        print(n-1);               // Just inserting elements in call stack
        System.out.print(n + " ");// These Two to get descending order

        // call stack plays a major role
        // as above the function never reaches to the last SOUT statement for the
        // first "n" iterations.
        // but when emptying the stack, it ignores the "print (n-1)" part as
        // in the stack it was already called.

    }

    public static void main(String[] args) {

        print(10);
    }
}
