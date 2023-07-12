package _11_Stack;

import java.util.Stack;

public class _5_ReverceStack {

    public static void pushAtBot(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top = st.pop();
        pushAtBot(st, val);
        st.push(top);
    }

    public static void revStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int val = st.pop();
        revStack(st);
        pushAtBot(st, val);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(2);
        st.push(4);
        st.push(7);

        revStack(st);

        while (!st.isEmpty()){
            System.out.print(st.pop() + " | ");
        }
    }
}
