import java.util.Arrays;

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
        StringBuilder uncommonChars = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) {
                if (uncommonChars.indexOf(String.valueOf(c)) == -1) {
                    uncommonChars.append(c);
                }
            }
        }
        for (char c : s2.toCharArray()) {
            if (s1.indexOf(c) == -1) {
                if (uncommonChars.indexOf(String.valueOf(c)) == -1) {
                    uncommonChars.append(c);
                }
            }
        }
        
        char[] uncommonArray = uncommonChars.toString().toCharArray();
        Arrays.sort(uncommonArray);

        return new String(uncommonArray);
    }

    public static void main(String[] args) {
        // Sample test cases
        String s1 = "coding ninjas";
        String s2 = "uncommon common";
        System.out.println(findUncommonCharacters(s1, s2)); // Output: "acdgjosu"
    }
}
