import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question10 {
    /*
     * Question
     * Given two strings S1 and S2 of lowercase alphabets, find the list of uncommon
     * characters for the two strings.
     * A character is uncommon if it is present only in one of the strings i.e. it
     * is either present in S1 or S2, but not in both.
     * Note :
     * 1. Both the strings contain only lowercase alphabets and can contain
     * duplicates.
     * 2. Return the uncommon characters in lexicographically sorted order
     * Need to practice once or 2 times
     */

    public static String findUncommonCharacters(String s1, String s2) {

        // Hash table of size 26, initialized to 0.
        int presenceOfChars[] = new int[26];
        Arrays.fill(presenceOfChars, 0);

        for (int i = 0; i < s1.length(); i++) {
            presenceOfChars[s1.charAt(i) - 'a'] = 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (presenceOfChars[s2.charAt(i) - 'a'] == 1) {
                // Character is present in both the strings.
                presenceOfChars[s2.charAt(i) - 'a'] = -1;
            } else if (presenceOfChars[s2.charAt(i) - 'a'] == 0) {
                // Character is present only in string 2.
                presenceOfChars[s2.charAt(i) - 'a'] = 2;
            }
        }

        String ans = "";
        for (int i = 0; i < 26; i++) {
            // Character is present in either of the two strings.
            if (presenceOfChars[i] == 1 || presenceOfChars[i] == 2) {
                ans += (char) ('a' + i);
            }
        }
        return ans;
    }
}
