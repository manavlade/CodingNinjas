public class Question8 {
    public static void inplaceRotate(int[][] arr, int n) { 
        /*
         * Question
         * You are given a square matrix of non-negative integers of size 'N x N'. Your
         * task is to rotate that array by 90 degrees in an anti-clockwise direction
         * without using any extra space.
         * For example:
         * For given 2D array :
         * [ [ 1, 2, 3 ],
         * [ 4, 5, 6 ],
         * [ 7, 8, 9 ] ]
         * After 90 degree rotation in anti clockwise direction, it will become:
         * [ [ 3, 6, 9 ],
         * [ 2, 5, 8 ],
         * [ 1, 4, 7 ] ]
         */
       for (int i = 0; i < n/2; i++) {
        for (int j = i; j < n - i -1; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][n - 1 - i];
            arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];
            arr[n - 1 - i][n - 1 - j] = arr[n - 1 - j][i];
            arr[n - 1 - j][i] = temp;
        }
       }
    }

}
