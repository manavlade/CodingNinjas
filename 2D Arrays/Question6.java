public class Question6 {
    public static long countRectangles(int m, int n){
        /*
         * Question
         * You are given an arbitrary grid with M rows and N columns. You have to print
         * the total number of rectangles which can be formed using the rows and columns
         * of this grid. In simple words, print the number of unique rectangles in the
         * grid.
         * 
         * For example:
         * Consider the grid shown below. The dark black boundary encloses a grid of
         * dimension 3x4.
         * 
         * The green colour represents rectangles of dimension 1x1.
         * The brown colour represents the rectangles of dimension 1x2.
         * The blue colour represents the rectangles of dimension 2x2.
         * The red colour represents the rectangles of dimension 3x3.
         * The yellow colour represents the rectangles of dimension 3x1.
         * There can be many different other possibilities as well. You need to print
         * the total number of all such rectangles.
         * Note:
         * 
         * Two rectangles are said to be unique if atleast one of their 4 sides is
         * non-overlapping.
         * Detailed explanation ( Input/output format, Notes, Images )
         * Constraints:
         * 1 <= T <= 100
         * 1 <= N, M <= 10^4
         * Time Limit: 1sec
         * Sample Input 1:
         * 1
         * 3 4
         * Sample Output 1:
         * 60
         * Explanation for sample input 1:
         * In a grid of 3x4 dimensions,
         * There are 30 rectangles of 1xN where N=1, 2, 3, 4
         * There are 20 rectangles of 2xN where N=1, 2, 3, 4
         * There are 10 rectangles of 3xN where N=1, 2, 3, 4
         * Adding all these values, we get 30+20+10 = 60.
         * Hence, there are 60 rectangles in a grid of dimension 3x4.
         * Sample Input 2:
         * 1
         * 4 5
         * Sample Output 2:
         * 150
         */
        long ans = ((long)1 * m * (m +1) * n * (n +1)) / 4;
        return ans;
    }
}
