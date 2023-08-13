package _3_Strings;

import java.util.Arrays;

public class _5_LongestCommonPrefix {

    /*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
     */

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        // This is done as, there is maximum difference of both length and letter in the first and last word of a sorted string array. As, if any of the strings are diffrent then there wont be any similar prefix then why not use the most different string.
        /* f we have array like: [Flower, flow, flight, good]
This array is sorted, now you can easily tell that there is no common prefix among all the elements by just comparing first and last coz 1st and last will have the most difference between them, say you have:
[flower, flow, apple, flight, good] sorting this would give [apple, flower, flow, flight, good]
You can clearly see that max difference between the characters is between 1st and last string.
*/
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;

        while (idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){ // This if the elemets are same.
                idx++;
            }
            else{ // if not same - just end it.
                break;
            }
        }
        return s1.substring(0, idx);   // Return the part of the string from starting index till the index it was same to the other string.
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

        // OUTPUT -- fl
    }
}
