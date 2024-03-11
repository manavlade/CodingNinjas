import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {
    /*
     * Question
     * Ninja has given you a list of WORDS and a PATTERN string. Your task is to
     * find all such words in the list which match the given pattern. A valid match
     * is found if and only if every character in the pattern is uniquely mapped to
     * a character in a word.
     * 
     * Example:
     * 
     * Let the list of words be {cod, zcz} and the pattern be ‘nin’.
     * For each word in the list, we will check whether the word matches the pattern
     * or not:
     * 
     * For the word ‘cod’:
     * Letter ‘n’ in the pattern maps to letter ‘c’ in the word.
     * Letter ‘i’ in the pattern maps to letter ‘o’ in the word.
     * Letter ‘n’ in the pattern maps to letter ‘d’ in the word.
     * 
     * As the same letter ‘n’ in the pattern, maps to two different letters ‘c’ and
     * ‘d’ in the word. Hence, ‘cod’ is not a valid match.
     * 
     * For the word 'zcz':
     * Letter ‘n’ in the pattern maps to letter ‘z’ in the word.
     * Letter ‘i’ in the pattern maps to letter ‘c’ in the word.
     * Letter ‘n’ in the pattern maps to letter ‘z’ in the word.
     * 
     * As every letter in the pattern maps uniquely to a corresponding letter in the
     * word. Hence 'zcz' is a valid match.
     */

    public static boolean patternCheck(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!map.containsKey(w)) {
                if (map.containsValue(p)) {
                    return false;
                }

                map.put(w, p);

            } else if (map.get(w) != p) {
                return false;
            }
        }

        return true;
    }

    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (patternCheck(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

}
