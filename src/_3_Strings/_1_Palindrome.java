package _3_Strings;

import java.net.Socket;

public class _1_Palindrome {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

     */

    public static boolean LeetPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    // Can be also done using for loop in DSA course
    public static boolean isPalindrome(String str){
        for (int i = 0; i< str.length()/2; i++ ){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean Palindrome(String string){

        int front = 0;
        int rear = string.length() - 1;

        while(front < rear) {
            if(string.charAt(front) != string.charAt(rear)){ 
                // No need to check if equal as then it will be a palindrome
                // This the condition for not a palindrome
                return false;
            }
            front++;
            rear--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        String string = "lokesh";
        String str = "racecar";
        System.out.println(isPalindrome(string));
        System.out.println(Palindrome(str));

    }
    
}
