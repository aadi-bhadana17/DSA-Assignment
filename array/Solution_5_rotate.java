package array;
public class Solution_5_rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k = k%n;
        rev(nums, 0, n-k-1);
        rev(nums, n-k, n-1);
        rev(nums, 0, n-1);
    }

    private void rev(int arr[], int s, int e) {
        while(s<e){
            int a = arr[s];
            arr[s] = arr[e];
            arr[e] = a;
            s++;
            e--;
        }
    }
}