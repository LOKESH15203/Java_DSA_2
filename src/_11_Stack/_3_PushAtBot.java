package _11_Stack;
import java.util.*;

public class _3_PushAtBot {

    public static void pushAtBottom(Stack<Integer> st ,int val){
        if(st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }


    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(2);
        st.push(4);
        st.push(7);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        while (!st.isEmpty()){
            System.out.print(st.peek() + " | ");
            st.pop();
        }

        pushAtBottom(st, 10);
        while (!st.isEmpty()){
            System.out.print(st.peek() + " | ");
            st.pop();
        }


    }
}
