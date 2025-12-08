
// class Solution {
//     public int maxSubArray(int[] arr) {
//         int res=Integer.MIN_VALUE;
//         int sum=-999999;
//         int n=arr.length;
//         for(int i=0;i<arr.length;i++){
//             sum=Math.max(sum+arr[i],arr[i]);
//             res=Math.max(res,sum);
//         }
//         return res;
//     }
// }