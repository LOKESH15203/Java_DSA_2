package _11_Stack;
import java.util.*;

public class _10_MaxAreaHistogram {

    public static double area(int arr[]){
        Stack<Integer> st = new Stack<>();
        double maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next smaller Right
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // only a diff. of >= from <= in NEXT-GREATER
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        // Next Smaller left
        st = new Stack<>();                  // NEW STACK
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // only a diff. of >= from <= in NEXT-GREATER
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        // AREA
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1; // i -j -1; We are neither taking i nor j hence -1 to exclude j as i is already excluded.
            double area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;

        // Current area
//        int l = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>l){
//                l = arr[i];
//            }
//        }
//        double area = l*1;
//        System.out.println("The area is " + area + "sqr. units");
//        return area;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(area(arr));
    }
}
