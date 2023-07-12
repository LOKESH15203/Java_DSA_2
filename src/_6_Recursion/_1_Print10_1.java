package _6_Recursion;

public class _1_Print10_1 {

    public static void print(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n-1);
//        for (int i = n; i>=0; i--){
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) {

        print(10);
    }
}
