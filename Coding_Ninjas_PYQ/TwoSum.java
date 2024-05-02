import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    // public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer>
    // nums, int target, int n)
    // {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // int t = 0;
    // ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
    // for (int i = 0; i < n; i++) {
    // int element = nums.get(i);
    // int want = target - element;

    // if (map.containsKey(want) && map.get(want) > 0 && map.get(want) != -1) {
    // t = 1;
    // result.add(new Pair<>(want, element));
    // int p = map.get(want);
    // map.put(want, p - 1);
    // map.put(element, -1);
    // }

    // // Always put the current element in the map, even if no match is found,

    // // to handle the case of duplicates.

    // if (map.containsKey(element))

    // {
    // int p = map.get(element);
    // map.put(element, p + 1);

    // } else {
    // map.put(element, 1);

    // }
    // }
    // if (t == 0) {
    // result.add(new Pair<>(-1, -1));

    // }
    // return result;
    // }

    /*
     * Question
     * You are given two numbers 'A' and 'B' in the form of two arrays (A[] and B[])
     * of lengths 'N' and 'M' respectively, where each array element represents a
     * digit. You need to find the sum of these two numbers and return this sum in
     * the form of an array.
     */
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {

        int firstNum = converToInt(a, n);
        int secondNum = converToInt(b, m);

        int total = firstNum + secondNum;

        ArrayList<Integer> list = new ArrayList<>();

        while (total > 0) {
            list.add(total % 10);
            total = total / 10;
        }

        int[] ans = new int[list.size()];
        int k = list.size() - 1;

        for (int i : list) {
            ans[k--] = i;
        }
        return ans;
    }

    public static int converToInt(int[] a, int n) {
        int ans = 0;
        int x = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans += x * a[i];
            x *= 10;
        }
        return ans;
    }
}
