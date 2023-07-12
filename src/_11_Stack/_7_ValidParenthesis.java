package _11_Stack;

import java.util.Stack;

public class _7_ValidParenthesis {

    public static boolean valid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(str.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({}[]";
        System.out.println(valid(str));
    }
}
