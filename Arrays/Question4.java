import java.util.HashMap;

public class Question4 {
    /*
     * You have been given an array/list 'ARR' consisting of 'N' integers. Your task
     * is to find the majority element in the array. If there is no majority element
     * present, print -1.
     * Note:
     * A majority element is an element that occurs more than floor('N' / 2) times
     * in the array.
     */
    public static int findMajority(int[] arr, int n) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            map.put(current, map.getOrDefault(current,0) + 1);
        }

       for (int i : map.keySet()) {
        if(map.get(i) >  n /2){
            return i;
        }
       }
       /*
       Example
        * 2 -> 2 times
        * 3 -> 4 times
        * 4 -> 1 time
        * Iterate through the frequency map to check for a majority element: 
        * For element 2, the frequency is 2, which is not greater than n / 2 (7 / 2 =
        * 3.5), so it's not a majority element.
        * For element 3, the frequency is 4, which is greater than n / 2, so it is
        * considered a majority element.
        * For element 4, the frequency is 1, which is not greater than n / 2, so it's
        * not a majority element.
        */
       return -1;
    }
}
