package matrix_2D;
public class Solution_2_searchMatrix {
    boolean flag = false;
    public boolean searchMatrix(int[][] matrix, int target) {
        rec(matrix, target, 0, matrix.length-1, matrix[0].length-1);
        return flag;
    }

    private void rec(int [][]arr, int target, int s, int e, int j) {
        if(flag) return;
        
        int mid = s + (e - s) / 2;
        int x = arr[mid][j];
       

        if(s == e) {
            for(int k = 0; k<=j; k++) {
                
                if(arr[s][k] == target) {flag = true; return; }
            } return;
        }

        if(arr[mid][0] == target || x == target) {flag = true; return;}
        else if(x > target) rec(arr, target, s, mid, j);
        else rec(arr, target, mid+1, e, j);

        return;
    }
}