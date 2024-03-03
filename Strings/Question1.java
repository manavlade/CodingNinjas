package Strings;

public class Question1 {
    /*
     * Question
     * You are given a string 'str' and an integer 'D'. Your task is to rotate the
     * given string left (anticlockwise) and right (clockwise) by 'D' units from the
     * starting index. You are required to return the rotated string.
     * 1
     * codingninjas
     * 3
     * Sample Output 1 :
     * ingninjascod jascodingnin
     * Explanation For The Sample Output 1 :
     * In string “codingninjas” the substring of length 'D' = 3, starting from the
     * beginning is “cod”, in the left rotation this substring is removed from the
     * beginning and attached to the end of the string (i.e. anti-clockwise).
     * 
     * Similarly, in the right rotation, the substring of length 'D' = 3 from the
     * end is “jas”, this substring is removed from the end and attached to the
     * beginning of the string(i.e. clockwise).
     */
    public static String leftRotate(String str, int d) {
        int size =  str.length();
        d= d % size;
        return str.substring(d) + str.substring(0, d);
    }

    public static String rightRotate(String str, int d) {
        int size = str.length();
        d = d % size;

        return str.substring( size - d) + str.substring(0, size - d);
    }

}
