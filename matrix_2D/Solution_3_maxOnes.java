package matrix_2D;
public class Solution_3_maxOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int row = 0;

        for(int i=0; i<mat.length; i++) {
            int rowMax = 0;
            for(int j = 0; j<mat[0].length; j++) {
                if(mat[i][j] == 1) rowMax++;
            }
            if(max < rowMax) {
                max = rowMax;
                row = i;
            }
        }
        return new int[] {row, max};
    }
}