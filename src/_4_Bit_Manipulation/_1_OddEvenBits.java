package _4_Bit_Manipulation;

public class _1_OddEvenBits {

    public static void oddOrEven(int n){

        int bitmask = 1;
        
        if((n & bitmask) == 0){
            System.out.println("Is EVEN");
        }
        else{
            System.out.println("Is ODD");
        }
    }

    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(3);
        
    }
    
}
