package _0_TP;

public class a2palindrome {

    void check(int n){
        int re;
        int pow = 3, pal = 0;

        while(n>0){
            re = n % 10;
            pal = pal + (re * (int) Math.pow(10, pow));
            pow --;
            n = n/10;
        }
        System.out.println(pal);

        if(pal == n){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        
       a2palindrome p = new a2palindrome();
        
       p.check(321);
    }
}
