
import java.util.HashMap;

public class Question2 {
    /*
     * Question
     * You have been given a string 'S' which only consists of lowercase
     * English-Alphabet letters.
     * 
     * Your task is to find the shortest(minimum length) substring of 'S' which
     * contains all the characters of 'S' at least once. If there are many
     * substrings with the shortest length, then find one which appears earlier in
     * the string i.e. substring whose starting index is lowest.
     * 
     * For example-
     * If the given string is S = "abcba", then the possible substrings are "abc"
     * and "cba". As "abc" starts with a lower index (i.e. 0, "cba" start with index
     * 2), we will print "abc" as our shortest substring that contains all
     * characters of 'S'.
     */

    // Need to practice once
    public static String shortestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        int n = mp.size();
        mp.clear();
        int ians = 0, maxm = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if (mp.size() < n)
                j++;
            else if (mp.size() == n) {
                if (j - i + 1 < maxm) {
                    maxm = j - i + 1;
                    ians = i;
                }
                while (i < j) {
                    char rchar = s.charAt(i);
                    int cnt = mp.get(rchar);
                    if (cnt > 1)
                        mp.put(rchar, cnt - 1);
                    else {
                        mp.remove(rchar);
                        i++;
                        break;
                    }
                    i++;
                    if (j - i + 1 < maxm) {
                        maxm = j - i + 1;
                        ians = i;
                    }
                }
                j++;
            }
        }
        return s.substring(ians, ians + maxm);
    }

}
