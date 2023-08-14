package _3_Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _8_LongestSubstring {
    /*Given a string s, find the length of the longest
            substring
    without repeating characters.
      */

    /*
    We use a set (charSet) to keep track of unique characters in the current substring.
    We maintain two pointers, left and right, to represent the boundaries of the current substring.
    The maxLength variable keeps track of the length of the longest substring encountered so far.
    We iterate through the string using the right pointer.
    If the current character is not in the set (charSet), it means we have a new unique character.
    We insert the character into the set and update the maxLength if necessary.
    If the character is already present in the set, it indicates a repeating character within the current substring.
    In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
    We insert the current character into the set and continue the iteration.
    Finally, we return the maxLength as the length of the longest substring without repeating characters.
     */

// BY me -  Only for few test cases
    public static int lengthOfLongestSubstring(String s) {
        int size = Integer.MIN_VALUE;
        ArrayList<Character> al = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            if (al.contains(s.charAt(i))){
                size = Math.max(size, al.size());
                al.clear();
            }
            else {
                al.add(s.charAt(i));
            }
        }
        return size;
    }

    // Leet - for all test cases.
    public static int leetLengthOfLongestSubstring(String s) {
        int size = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right=0; right<s.length(); right++){
            if (!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                size = Math.max(size, right-left+1);
            }
            else {
                while (charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return size;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(leetLengthOfLongestSubstring(s));

    }
}
