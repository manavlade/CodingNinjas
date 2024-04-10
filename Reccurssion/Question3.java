public class Question3 {
    /*
     * Question
     * You are given an array of integers "ARR" of length 'N' and an integer 'K'.
     * Your task is to find whether or not you can divide the array "ARR" into 'K'
     * subsets with equal sum.
     * 
     * A subset of an array "ARR" is another array whose every element is present in
     * array "ARR".
     * 
     * For example:
     * If ARR = {1, 2, 3, 4}, then array {3,4} is a subset of "ARR" because both 3
     * and 4 are also elements of "ARR".
     * For example:
     * 
     * Consider array ARR = {3, 5, 2, 4, 4} and K = 2, i.e. you have to divide "ARR"
     * into 2 subsets with equal sum. The division will be {4, 5} and {2, 3, 4} with
     * sum 9.
     * Note:
     * 
     * Every element of the array must occupy only one subset.
     * My comment
     * Need to prsctice once 
     */
    static boolean rec(int index, int div, int arr[], boolean vis [] , int K, int currentSum){
        
        if(K == 0) return true;

        if(currentSum > div ) return false;

        if(currentSum ==  div) return rec(0, div, arr, vis, K-1, 0);

        for (int i = index; i < arr.length; i++) {
            if (vis[i])
                continue;

            vis[i] = true;

            if (rec(i + 1, div, arr, vis, K, currentSum + arr[i]))
                return true;

            vis[i] = false;

        }
        return false;
    }

    static boolean splitArray(int arr[], int K, int index, int sum) {

        int totalSum = 0, n = arr.length;

        for (int i : arr) totalSum += i;

        if(totalSum < K || totalSum % K != 0) return false;

        int div = totalSum / K;

        boolean vis [] = new boolean[n];

        return  rec(0, div, arr, vis, K, 0);
        
    }

}
