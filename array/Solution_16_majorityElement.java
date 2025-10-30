package array;
public class Solution_16_majorityElement {
    public int majorityElement(int[] nums) {
        int x,max;
        x=max=0;

        for(int n : nums){
            if(max==0) x=n;
            max += n == x ? 1 : -1;
        }
        return x;
    }
}