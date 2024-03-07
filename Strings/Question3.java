package Strings;

public class Question3 {
    /*
     * Question
     * You are given a number 'N' in the form of a string 'S', which is a
     * palindrome. You need to find the greatest number strictly less than 'N' which
     * is also a palindrome.
     * Note:
     * 1. A palindrome is a word, number, phrase, or another sequence of characters
     * that reads the same backward as forward, such as madam, racecar, 1234321,
     * etc.
     * 2. The numerical value of the given string S will be greater than 0.
     * 3. A single-digit number is also considered a palindrome.
     * 4. The answer number should not contain any leading zeros, except for the
     * case when the answer is 0.
     * 5. Note that the length of the string is nothing but the number of digits in
     * N.
     */
    public static String nextSmallerPalindrome(String s) {
        // Need to practice once
        if(s.length() == 1 && s.charAt(0) == '1'){
            return "0";
        }

        int n = s.length();
        int mid = n /2;
        char [] arr = s.toCharArray();
        
        for (int i = mid; i < n; i++) {
            int digit = arr[mid] - '0';
            if(digit != 0){
                arr[i] = arr[n - 1 -i] = (char) ((digit - 1 ) + '0');
                break;
            }
            else {
                arr[i] = arr[n - 1 - i] = '9';
            }
        }
        if (arr[0] == '0') {
            arr[0] = '9';
            return String.valueOf(arr).substring(0, n - 1);
        }
        return String.valueOf(arr);
    }
}
