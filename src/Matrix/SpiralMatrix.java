package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    // Question : Given an m x n matrix, return all elements of the matrix in spiral order.
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;

            int left = 0;
            int top = 0;
            int right = m-1;
            int bottom = n-1;

            while(left<=right && top<=bottom){
                //left to right traversal
                for(int i = left; i<=right ;i++){
                    ans.add(matrix[top][i]);
                }
                top++;

                //top or right to bottom traversal
                for(int i = top; i<= bottom; i++){
                    ans.add(matrix[i][right]);
                }
                right--;

                //right to left  traversal & ....edge case
                if(top<=bottom){
                    for(int i = right ; i >= left ; i--){
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                //bottom to top traversal & ....edge case
                if(left<=right){
                    for(int i = bottom ; i>=top;i--){
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return ans;
        }
}

