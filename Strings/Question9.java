import java.util.ArrayList;

public class Question9 {
    /*
     * Question
     * Given two strings ‘STR’ and ‘PTR’. Find all the starting indices of ‘PTR’
     * anagram substring in ‘STR’. Two strings are anagram if and only if one string
     * can be converted into another string by rearranging the character.
     * 
     * For example, ‘ABCD’ and ‘ACBD’ are two anagram strings because ‘ACBD’ can be
     * converted into ‘ABCD’ by rearranging the ‘B’ and ‘C’. ’ABA’ and ‘ABB’ are not
     * anagram because we can’t convert ‘ABA’ to ‘ABB’ by rearranging the characters
     * of particular strings.
     * 
     * ‘ABACD’ and ‘CABAD’ are anagram because ‘ABACD’ can be converted into ‘CABAD’
     * by rearranging the first ‘A’ with ‘C’ and second ‘A’ with ‘B’.
     * 
     * Note:
     * Strings ‘STR’ and ‘PTR’ consist only of English uppercases.
     * 
     * Length of string ‘STR’ will always be greater than or equal to the length of
     * string ‘PTR’.
     * 
     * The index is ‘0’ based.
     * 
     * In case, there is no anagram substring then return an empty sequence.
     * Explanation:
     * 
     * For example, the given ‘STR’ is ‘BACDGABCD’ and ‘PTR’ is ‘ABCD’. Indices are
     * given
     * 
     * 0-3 in ‘STR’ index 0,1,2,3 are ‘BACD’ and it is an anagram with ‘ABCD’
     * 1-4 in ‘STR’ index 1,2,3,4 are ‘ACDG’ and it is not anagram with ‘ABCD’
     * 2-5 in ‘STR’ index 2,3,4,5 are ‘CDGA’ and it is not anagram with ‘ABCD’
     * 3-6 in ‘STR’ index 3,4,5,6 are ‘DGAB’ and it is not anagram with ‘ABCD’
     * 4-7 in ‘STR’ index 4,5,6,7 are ‘GABC’ and it is not anagram with ‘ABCD’
     * 5-8 in ‘STR’ index 5,6,7,8 are ‘ABCD’ and it is an anagram with ‘ABCD’
     * 
     * Hence there are 2 starting indices of substrings in the string ‘STR’ that are
     * anagram with given ‘PTR’ which are index 0 and 5.
     * 
     * NEED TO PRACTICE ONCE QUIT COMPLEX
     */
    public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();

        int ptnFreq [] = new int[26];
        for (char c : ptn.toCharArray()) {
            ptnFreq[c - 'A']++;
        }

        int windowFreq [] = new int[26];

        for (int i = 0; i < m; i++) {
            windowFreq[str.charAt(i) - 'A']++;
        }

        if(isAnagram(ptnFreq, windowFreq)){
            result.add(0);
        }

        for (int i = m; i < n; i++) {
            windowFreq[str.charAt(i - m) - 'A']--;
            windowFreq[str.charAt(i)- 'A']++;

            if(isAnagram(ptnFreq, windowFreq)){
                result.add(i-m+1);
            }
        }
        return result;
    }

    private static boolean isAnagram(int ptnFreq [], int windowFreq []) {
        for (int i = 0; i < 26; i++) {
            if(ptnFreq[i] != windowFreq[i]){
                return false;
            }
        }
        return true;
    }
}