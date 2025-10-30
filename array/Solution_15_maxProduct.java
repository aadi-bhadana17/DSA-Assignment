package array;
public class Solution_15_maxProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], superMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            if (x < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(x, max * x);
            min = Math.min(x, min * x);

            superMax = Math.max(superMax, max);
        }

        return superMax;
    }
}
