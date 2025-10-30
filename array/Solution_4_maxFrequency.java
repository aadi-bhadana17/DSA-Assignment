package array;
public class Solution_4_maxFrequency {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int m = Integer.MIN_VALUE;
        
        for(int x : nums) m = Math.max(x,m);

        int arr[] = new int[m+1];
        for(int x : nums) arr[x]++;

        int max = Integer.MIN_VALUE;

        for(int x : arr) max = Math.max(x,max);
        int ans = 0;

        for(int x : arr) if(x==max) ans+=x;

        return ans;
    }
}