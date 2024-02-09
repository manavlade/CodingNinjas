public class Question3 {
    /*
     * Question
     * You are given an array of integers ARR[] of size N consisting of zeros and
     * ones. You have to select a subset and flip bits of that subset. You have to
     * return the count of maximum one’s that you can obtain by flipping chosen
     * sub-array at most once.
     * 
     * A flip operation is one in which you turn 1 into 0 and 0 into 1.
     * 
     * For example:
     * If you are given an array {1, 1, 0, 0, 1} then you will have to return the
     * count of maximum one’s you can obtain by flipping anyone chosen sub-array at
     * most once, so here you will clearly choose sub-array from the index 2 to 3
     * and then flip it's bits. So, the final array comes out to be {1, 1, 1, 1, 1}
     * which contains five ones and so you will return 5.
     */
    public static int flipBits(int[] arr, int n) {
        // Write your code here
        int count_1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count_1++;
                arr[i] = -1;
            } else
                arr[i] = 1;
        }
        int max_sum = findmaxsum(arr);
        max_sum = Math.max(0, max_sum);

        return max_sum + count_1;

    }

    static int findmaxsum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
