package recursion;
public class Solution_6_pivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int x : nums) total+=x;

        return rec(nums, 0, 0, total);
    }

    private int rec(int arr[], int i, int left, int total) {
        if(i == arr.length) return -1;
        if(left == total-left-arr[i]) return i;

        return rec(arr, i+1, left + arr[i], total);
    }
}