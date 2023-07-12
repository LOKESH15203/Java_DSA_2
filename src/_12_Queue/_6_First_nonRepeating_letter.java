package _12_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _6_First_nonRepeating_letter {

    public static void repeat(String str){
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }
            else{
                System.out.println(q.peek()+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        repeat(str);
    }
}
