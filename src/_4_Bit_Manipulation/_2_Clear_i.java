package _4_Bit_Manipulation;

public class _2_Clear_i {

    public static int clear(int n, int i){

        int bitmask = ~(1 << i);
        
        int cleared = n & bitmask;

        return cleared;
    }

    public static void main(String[] args) {

        System.out.println(clear(10, 1));  
        
    }
    
}
