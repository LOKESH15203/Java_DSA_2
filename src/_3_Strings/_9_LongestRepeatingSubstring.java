package _3_Strings;

public class _9_LongestRepeatingSubstring {

    /*
    You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.
     */

    public static int characterReplacement(String s, int k) {
        // This is done using the sliding window approach
        // WE are not replacing the elements.
        // Just playing along with the highest possibility.
        // Can we or Can Not replace the No. of elements in the string to make the longest substring?
        int left = 0, maxLen = 0, longestSeq = 0;
        int[] arr = new int[26];
        for (int right =0; right<s.length(); right++){
            arr[s.charAt(right) - 'A']++;

            longestSeq = Math.max(longestSeq, arr[s.charAt(right) - 'A']);

            if ((right - left + 1) - longestSeq > k){ // This gives if the length of the current window - The length of the longest current sequence < k;
                // so we need to reduce the length of the current longest sequence until we get the a sequece from which we change 'k' elements to get the longest sequence in that window.
                arr[s.charAt(left) - 'A']--; // We reduce freq. count from the '26' array &
                left++; // we reduce the size of the window from left.
            }
            maxLen = Math.max(maxLen, right - left + 1); // max Length of window, which can be made into the longest substring by replacing k items.
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
