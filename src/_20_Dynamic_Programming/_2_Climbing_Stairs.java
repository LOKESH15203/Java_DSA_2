package _20_Dynamic_Programming;

public class _2_Climbing_Stairs {

    public static int countStairs(int n){
        if(n==0){           // For not climbing there is "1" way i.e. not to do anything 🤣
            return 1;
        }
        if(n < 0){          // Function is recursively called for lower values which can go below 0;
            return 0;
        }

        return countStairs(n-1) + countStairs(n-2);
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(countStairs(n));
    }
}
