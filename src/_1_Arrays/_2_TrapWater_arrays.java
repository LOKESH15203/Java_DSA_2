package _1_Arrays;
public class _2_TrapWater_arrays {

    public static int trapWater(int highest[]){

        int n = highest.length;

        // calculating leftMax bound
        int leftMax[] = new int[n];
        leftMax[0] = highest[0];
        for(int i = 1; i < n; i++){                           // This stores the left max for index i;
            leftMax[i] = Math.max(highest[i], leftMax[i-1]);
        }

        int riMax[] = new int[n];
        riMax[n - 1] = highest[n - 1];
        for(int i=n - 2; i>=0; i--){
            riMax[i] = Math.max(highest[i], riMax[i+1]);
        }

        int trapWater = 0;
        for(int i = 0; i < n; i++){

            int waterLevel = Math.min(leftMax[i], riMax[i]);
            trapWater += waterLevel - highest[i];
        }
        
        return trapWater;
    }
    public static void main(String[] args) {
        
        int[] highest = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapWater(highest));
        
    }
    
}
