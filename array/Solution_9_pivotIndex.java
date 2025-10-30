package array;
public class Solution_9_pivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int x : nums) totalSum += x;
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(leftSum*2 == totalSum-nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}