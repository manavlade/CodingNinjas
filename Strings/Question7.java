import java.util.HashMap;

public class Question7 {
    /*
     * Question
     * You have been given two strings A and B consisting of lower case English
     * letters. The task is to count the minimum number of pre-processing moves on
     * the string A required to make it equal to string B after applying below
     * operations:
     * 1. Choose any index i (0 <= i < n) and swap characters a[i] and b[i].
     * 2. Choose any index i (0 <= i < n) and swap characters a[i] and a[n-i-1] .
     * 3. Choose any index i (0 <= i < n) and swap characters b[i] and b[n-i-1] .
     * In one preprocess move, you can replace a character in A with any other
     * character of the English alphabet.
     * Note:
     * 1. The number of changes you make after the preprocess move does not matter.
     * 2. You cannot apply to preprocess moves to the String B or make any
     * preprocess moves after the first change is made.
     */
    public static int minimumOperations(String a, String b) {
        if (a.length() != b.length()) {
            return -1;
        }
        if (a.length() == 1) {
            if (a.charAt(0) != b.charAt(0)) {
                return 1;
            }
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int n = a.length();
        int count = 0;

        while (i < n / 2) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
            map.put(a.charAt(n - i - 1), map.getOrDefault(a.charAt(n - i - 1), 0) + 1);
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0) + 1);
            map.put(b.charAt(n - i - 1), map.getOrDefault(b.charAt(n - i - 1), 0) + 1);

            if (map.size() == 4) {
                count += 2;
            } else if (map.size() == 3) {
                if (a.charAt(i) == a.charAt(n - i - 1)) {
                    count += 2;
                } else {
                    count++;
                }
            } else if (map.size() == 2) {
                int c = 0;
                for (int value : map.values()) {
                    c = value;
                    break;
                }
                if (c % 2 != 0) {
                    count++;
                }
            }
            map.clear();
            i++;
        }
        if (n % 2 != 0) {
            if (a.charAt(n / 2) != b.charAt(n / 2)) {
                count++;
            }
        }
        return count;
    }

}
