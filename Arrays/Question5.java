import java.util.ArrayList;
import java.util.HashMap;

public class Question5 {
    /*
     * Question
     * Given an array 'A' consisting of 'N' integers, find the smallest subarray of
     * 'A' containing exactly 'K' distinct integers.
     * Note :
     * If more than one such contiguous subarrays exist, consider the subarray
     * having the smallest leftmost index.
     * For example - if A is [1, 2, 2, 3, 1, 3 ] and k = 2 then the subarrays:
     * [1,2], [2,3], [3,1], [1,3] are the smallest subarrays containing 2 distinct
     * elements. In this case, we will consider the starting and ending index of
     * subarray [1,2] i.e. 0 and 1.
     * Sample Input 1 :
     * 4 3
     * 1 1 2 1 2
     * Sample Output 1 :
     * -1
     * Explanation Of Sample Input 1 :
     * The value of k = 3 and there are only two distinct elements in the given
     * array i.e 2 and 3. Therefore there exist no subarray with 3 distinct
     * elements.
     */
    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> a, int K) {
        int n = a.size();
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minleft = -1, minright = -1;

        while (right < n) {
            int rightElement = map.get(right);

            map.put(rightElement, map.getOrDefault(rightElement, 0) + 1);

            while (map.size() == K) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minleft = left;
                    minright = right;
                }

                int leftElement = map.get(left);
                map.put(leftElement, map.getOrDefault(leftElement, 0) + 1);

                if (map.get(leftElement) == 0) {
                    map.remove(leftElement);
                }
                left++;
            }
            right++;
        }
        ArrayList<Integer> r = new ArrayList<>();
        if (minLength == Integer.MAX_VALUE) {
            r.add(-1);
        } else {
            r.add(minleft);
            r.add(minright);
        }
        return r;
    }

}
