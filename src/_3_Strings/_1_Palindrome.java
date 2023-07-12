package _3_Strings;

import java.net.Socket;

public class _1_Palindrome {

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
                // No need to check if equal as then it will be a paldrome
                // This the conditon for not a palindrome
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
