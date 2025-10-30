package array;
public class Solution_2_MinDeletions {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        else if(n == 2)  return 2;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mxid = 0, mnid = 0;

        for(int i=0; i<n; i++) {
            int x = nums[i];
            if(max<x) {
                max = x;
                mxid = i;
            }
            if(min > x) {
                min = x;
                mnid = i;
            }
        }

        int a = Math.max(mxid+1, mnid+1);
        int b = Math.max(n-mxid, n-mnid);
        int c = Math.min(mxid,mnid) + 1 + n - Math.max(mxid, mnid);

        return Math.min(Math.min(a,b), c);
    }
}