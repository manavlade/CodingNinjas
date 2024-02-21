public class Question1 {
    /*
     * Question
     * You are given a square matrix, return true if the matrix is symmetric
     * otherwise return false.
     * A symmetric matrix is that matrix whose transpose is equal to the matrix
     * itself.
     * Example of symmetric matrix :
     */
    public static boolean isMatrixSymmetric(int[][] matrix) {
       int row = matrix.length;
       for (int i = 0; i < row; i++) {
        for (int j = i+1; j < row; j++) {
            if(matrix[i][j] != matrix[j][i]){
                return false;
            }
        }
       }
       return true;
    }

}
