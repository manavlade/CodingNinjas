public class Question2 {
    /*
     * Question
     * A matrix is constructed of size n*n and given an integer ‘q’. The value at
     * every cell of the matrix is given as, M(i,j) = i+j, where ‘M(i,j)' is the
     * value of a cell, ‘i’ is the row number and ‘j’ is the column number. Return
     * the number of cells having value ‘q’.
     * Assume, the array is in 1-based indexing.
     * Sample Input 1:
     * 2
     * 4 2
     * 3 4
     * Sample Output 1:
     * 1
     * 3
     * Explanation of the Sample Input1:
     * Test case 1:
     * 
     * The matrix we get after using M(i,j) = i+j is:
     * 
     * 2 3 4 5
     * 3 4 5 6
     * 4 5 6 7
     * 5 6 7 8
     * 
     * Only cell (1,1) is having the value 2. Hence the value of ‘q’ is 1 here.
     */
    public static long query(long n, long q) {
        if (q <= (1L + n)) {

            long t = (1L + n) - q;

            return n - t;

        } else {

            long t = (n + n) - q;

            return (n - (n - t) + 1);

        }

    }
}
