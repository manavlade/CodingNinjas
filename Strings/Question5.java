import java.util.ArrayList;

public class Question5 {
    /*
     * Question
     * You have been given two strings, let's say 'STR1' and 'STR2' of equal
     * lengths. You are supposed to return the minimum number of manipulations
     * required to make the two strings anagrams.
     * Note:
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase. We can generalise this in string processing by
     * saying that an anagram of a string is another string with the same quantity
     * of each character in it, in any order.
     * Example:
     * String “eat” and “ate” are anagram to each other but string “buy” and “bye”
     * are not.
     */
    public static int getMinimumAnagramDifference(String str1, String str2) {
        int s = 0;
        int [] f = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            f[str1.charAt(i) - 'a']++;
            f[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(f[i] != 0){
                s += Math.abs(f[i]);
            }
        }
        return s/2;
    }

}
