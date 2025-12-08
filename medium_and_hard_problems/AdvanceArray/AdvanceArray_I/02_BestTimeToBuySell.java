class Solution {
    public int maxProfit(int[] arr) {
        int buy=arr[0];int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>buy)max=Math.max(max,arr[i]-buy);
            else buy=arr[i];
        }
        return max;
    }
}
