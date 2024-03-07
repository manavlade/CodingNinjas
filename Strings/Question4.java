package Strings;

import java.util.HashSet;
import java.util.Set;

public class Question4 {
    /*
     * Question
     * Given a string 'S' of length 'L', return the length of the longest substring
     * without repeating characters.
     * Example:
     * Suppose given input is "abacb", then the length of the longest substring
     * without repeating characters will be 3 ("acb").
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> nr = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!nr.contains(s.charAt(j))) {
                nr.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                nr.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
