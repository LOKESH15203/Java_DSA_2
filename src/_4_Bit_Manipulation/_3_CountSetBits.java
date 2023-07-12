package _4_Bit_Manipulation;

public class _3_CountSetBits {

    public static int setBits(int n){

        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(setBits(7));
    }   
}