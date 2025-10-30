package array;
public class Solution_14_maxSubArray {
    public int maxSubArray(int[] nums) {
        int mx=nums[0];
        int mx1=nums[0];
        for(int i=1; i<nums.length; i++){
           mx=Math.max(nums[i], mx+nums[i]);
           mx1=Math.max(mx,mx1);
        }
        return mx1;
    }
}