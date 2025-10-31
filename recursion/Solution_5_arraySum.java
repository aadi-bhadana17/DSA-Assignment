package recursion;

public class Solution_5_arraySum {
    int arraySum(int arr[]) {
        return rec(arr, 0);
    }
    
    private int rec(int arr[], int i) {
        if(i==arr.length) return 0;
        
        return arr[i] + rec(arr, i+1);
    }
}
