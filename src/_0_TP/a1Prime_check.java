package _0_TP;

import java.util.Scanner;

public class a1Prime_check {

    boolean check(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. to check");
        int n = sc.nextInt();

        for(int i=2; i<=Math.sqrt(n); i++){ // use boolean pointer and then print if prime or not.
            if( n % i == 0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        a1Prime_check c = new a1Prime_check();

        c.check();
        
    }
}
