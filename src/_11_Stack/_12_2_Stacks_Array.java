package _11_Stack;

public class _12_2_Stacks_Array {

    static class ArrStack{
        static int[] arr = new int[8];
        static int n = 8;
        static int top1 = arr[0];
        static int top2 = arr[n/2];

        public static boolean isEmpty1(){
            return arr.length == 0;
        }
    }

    public static void main(String[] args) {

    }
}
