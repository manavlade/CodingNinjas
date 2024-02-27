public class Question5 {
    public static int countFlip(int[][] mat) {
        /*
        Link to the question 
        https://www.codingninjas.com/studio/guided-paths/interview-guide-for-product-based-companies/content/111356/offering/1280162?leftPanelTabValue=PROBLEM
         * Question
         * You have been given a binary matrix ‘MAT’ of size ‘N’ * ’N’. Let ‘i’, ’j’
         * denote the row and column of the matrix, respectively. If ‘MAT’[i][j] is
         * equal to 0, flip every 1 in the ‘i’th row and ‘j’th column i.e., in the same
         * row and the column as 0.
         * Your task is to return the total number of flips done over all the elements
         * of the matrix.
         * Note:
         * 1. Each element in the matrix 'MAT' is either a ‘0’ or ‘1.’
         * 2. The flip operation is performed only for the 0s in the original matrix,
         * and not for the new 0s formed as a result of flipping 1s in the original
         * matrix.
         * 3. If a cell is already flipped, don’t flip it twice.
         * 4. Return the minimum number of flips needed.
         * Sample Input 1:
         * 1
         * 4
         * 1 0 1 1
         * 1 1 0 1
         * 1 1 1 1
         * 1 1 0 1
         * Sample Output 1:
         * 11
         * Explanation of sample input 1:
         * We can see that ‘MAT’[0][1] is zero so we flip all elements which are 1 in
         * the ith row i.e 0 th row and jth column i.e. 1st column. We can clearly see
         * that there are 3 1s in the 0th row and 3 1s in the 1st column. Hence for the
         * ‘0’ at ‘MAT’[0][1] we make 3 + 3 = 6 flips.
         * 
         * We mark the already counted cells red so we don’t count them twice.
         * Now we encounter the next zero at ‘MAT’[2][1]. We flip the bits in the first
         * column which are unflipped and are 1 i.e ‘MAT’[2][2] and also the 1s which
         * are unflipped in the second row i.e ‘MAT’[1][0] and ‘MAT’[1][3].
         * 
         * Finally, the count is 6 + 3 = 9, as shown with the cells marked in red.
         * Now the last cell which is ‘0’ i.e ‘MAT’[3][2]. We check for all the cells in
         * the third row and second column and mark all the 1s which are not marked red
         * and increment the count.
         * Finally, we will have the following matrix.
         * We see that there are 11 cells marked red which indicate that we flipped 11
         * cells so we return 11.
         */
        int counter = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    for (int i = 0; i < mat.length; i++) {
                        if (mat[row][i] == 1) {
                            counter++;
                            mat[row][i] = -1;
                        }
                    }
                    for (int i = 0; i < mat[0].length; i++) {
                        if (mat[i][col] == 1) {
                            counter++;
                            mat[i][col] = -1;
                        }
                    }
                }
            }
        }
        return counter;
    }
}
