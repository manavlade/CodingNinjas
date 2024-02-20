import java.util.ArrayList;
import java.util.Arrays;

public class Question9 {
    /*
     * Question
     * You are given an array Arr consisting of n integers, you need to find all the
     * distinct triplets present in the array which adds up to zero.
     * An array is said to have a triplet {arr[i], arr[j], arr[k]} with 0 sum if
     * there exists three indices i, j and k such that i!=j, j!=k and i!=k and
     * arr[i] + arr[j] + arr[k] = 0.
     * Note :
     * 1. You can return the list of values in any order. For example, if a valid
     * triplet is {1, 2, -3}, then (2, -3, 1), (-3, 2, 1) etc is also valid triplet.
     * Also, the ordering of different triplets can be random i.e if there are more
     * than one valid triplets, you can return them in any order.
     * 2. The elements in the array need not be distinct.
     * 3. If no such triplet is present in the array, then return an empty list, and
     * the output printed for such a test case will be "-1".
     * Sample Input 1 :
     * 1
     * 5
     * -10 5 5 -5 2
     * 0
     * Sample Output 1 :
     * -10 5 5
     * Explanation for Sample Input 1 :
     * -10 5 5 is the only triplet that adds up to zero. Note that the order of
     * output does not matter, so 5 -10 5 or 5 5 -10 are also acceptable.
     */
    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (arr == null || n < 3) {
            return ans;
        }
        arr.sort(Integer::compareTo);
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0 && arr.get(i).equals(arr.get(i - 1))) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            int target = 0 - arr.get(i);

            while (left < right) {
                int currentSum = arr.get(left) + arr.get(right);

                if (currentSum == target) {
                    ArrayList<Integer> triplet = new ArrayList<>(
                            Arrays.asList(arr.get(i), arr.get(left), arr.get(right)));
                    ans.add(triplet);

                    while (left < right && arr.get(left).equals(arr.get(left + 1))) {
                        left++;
                    }
                    while (left < right && arr.get(right).equals(arr.get(right - 1))) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

}
