package CodingPrac;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {

  public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        
        // Step 1: Find the pivot
        int pivotIndex = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                pivotIndex = i;
                break;
            }
        }
        
        // If there is no pivot, it means the given permutation is the largest possible
        if (pivotIndex == -1) {
            Collections.sort(permutation);
            return permutation;
        }
        
        // Step 2: Find the successor
        int successorIndex = -1;
        for (int i = n - 1; i > pivotIndex; i--) {
            if (permutation.get(i) > permutation.get(pivotIndex)) {
                successorIndex = i;
                break;
            }
        }
        
        // Step 3: Swap pivot and successor
        Collections.swap(permutation, pivotIndex, successorIndex);
        
        // Step 4: Reverse the elements to the right of pivot
        reverse(permutation, pivotIndex + 1, n - 1);
        
        return permutation;
    }
    
    private static void reverse(ArrayList<Integer> permutation, int start, int end) {
        while (start < end) {
            Collections.swap(permutation, start, end);
            start++;
            end--;
        }
    }
}
