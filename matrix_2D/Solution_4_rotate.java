package matrix_2D;
public class Solution_4_rotate {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            for(int j=i; j<n-i-1; j++) {
                // a = i,j
                // b= j,n-1-i
                // c = n-1-i, n-1-j 
                // d = n-1-j, i

                int temp = arr[i][j];

                arr[i][j] = arr[n-1-j][i];
                arr[n-1-j][i] = arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j] = arr[j][n-1-i];
                arr[j][n-1-i] = temp;

            }
        } 
    }
}