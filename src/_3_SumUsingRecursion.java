public class _3_SumUsingRecursion {

    public static int sum(int n){
        if(n == 1){
            return n;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {

        int n=5;
        int sum=0;
        System.out.println(sum(n));

    }
}
