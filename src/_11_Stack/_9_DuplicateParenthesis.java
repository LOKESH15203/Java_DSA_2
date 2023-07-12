package _11_Stack;

import java.util.Stack;

public class _9_DuplicateParenthesis {

    public static boolean dupPar(String str){
        Stack<Character> st = new Stack<>();
        int i;
        for(i=0; i<str.length(); i++){
            char ch = str.charAt(i);
                if(ch == ')'){
                    int count = 0;
                    while(st.peek() != '('){
                        st.pop();
                        count++;
                        int classic;
                    }
                    if(count <1)
                        return true; // DUPLICATE exists
                    else{
                        st.pop();
                    }
                }
                else {
                    st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {

        String str = "(a+b)";
        String str1 = "((a+b))";
        System.out.println(dupPar(str1));

    }
}
