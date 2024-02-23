import java.util.ArrayList;
import java.util.List;

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Question3 {
    /*
     * Question
     * You are given an 'N * N' matrix of integers where each row and each column is
     * sorted in increasing order. You are given a target integer 'X'.
     * Find the position of 'X' in the matrix. If it exists then return the pair {i,
     * j} where 'i' represents the row and 'j' represents the column of the array,
     * otherwise return {-1,-1}
     * For example:
     * If the given matrix is:
     * [ [1, 2, 5],
     * [3, 4, 9],
     * [6, 7, 10]]
     * We have to find the position of 4. We will return {1,1} since A[1][1] = 4.
     */
    public static Pair search(int[][] matrix, int x) {
        
        int row = matrix.length;
        int column = matrix[0].length;

        // Easy solution
        // for (int i = 0; i < row; i++) {
        //     for(int j = 0; j < column; j++){
        //         if(matrix[i][j] == x){
        //             return new Pair(i, j);
        //         }
        //     }
        // }
        // return new Pair(-1, -1);

        // Alternative solution with less space and time complexity
        int i = 0, j = column-1;
        while (i < row && j >= 0) {
            if(matrix[i][j] == x){
                return new Pair(i, j);
            }
            else if(matrix[i][j] > x) {
                j--;
            }
            else {
                i++;
            }
        }
        return new Pair(-1, -1);
    }
    
}
