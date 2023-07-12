package _11_Stack;

import java.util.ArrayList;

public class _1_ArrayList_Stack {

    static class stackAL{
        static ArrayList<Integer> st = new ArrayList<>();

        public static boolean isEmpty(){
            return st.size() == 0;
        }
        public static void push(int val){
            st.add(val);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = st.get(st.size() -1);
            st.remove(st.size() - 1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = st.get(st.size() -1);
            return top;
        }
    }

    // ##########################################################################################
    // ##########################################################################################
    // ##########################################################################################
    // ##########################################################################################
    // ##########################################################################################
    public static void main(String[] args) {

        stackAL st = new stackAL();
        stackAL.push(3);
        stackAL.push(9);
        stackAL.push(10);
        stackAL.push(2);

        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }

    }
}
