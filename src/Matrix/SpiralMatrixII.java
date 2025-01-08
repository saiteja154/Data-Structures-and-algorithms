package Matrix;

public class SpiralMatrixII {


    // Question : Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
    public int[][] generateMatrix(int n) {

        int ans[][] = new int[n][n];

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int count = 1;
        while (left <= right && top <= bottom) {
            //left to right traversal
            for (int i = left; i <= right; i++) {
                ans[top][i] = count;
                count++;
            }
            top++;

            //top or right to bottom traversal
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count;
                count++;
            }
            right--;

            //right to left  traversal & ....edge case
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            //bottom to top traversal & ....edge case
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return ans;
    }

}
