package matrix_2D;
import java.util.*;
public class Solution_1_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right) {

            for(int i=top, j=left; j<=right; j++) list.add(matrix[i][j]);
            top++;

            for(int i=top, j=right; i<=bottom; i++) list.add(matrix[i][j]);
            right--;

            if(top <= bottom) {
                for(int j=right, i=bottom; j>=left; j--) list.add(matrix[i][j]);
                bottom--;
            }

            if(left <= right) {
                for(int i=bottom, j=left; i>=top; i--) list.add(matrix[i][j]);
                left++;
            }
        }
        return list;
    }
}