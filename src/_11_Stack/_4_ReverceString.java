package _11_Stack;

import java.util.Stack;

public class _4_ReverceString {

    public static StringBuilder reverce(String str){
        Stack<Character> st = new Stack<>();
        int idx;
        for(idx=0; idx<str.length(); idx++){
            st.push(str.charAt(idx));
        }
        StringBuilder result = new StringBuilder("");
        while (!st.isEmpty()){
            Character r = st.pop();
            result.append(r);
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "gnirtS";
        String strr = reverce(str).toString();
        System.out.println(strr);

    }
}
