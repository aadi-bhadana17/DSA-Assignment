// class Solution {
//     public int trap(int[] arr) {
//         int n=arr.length;
//         int[] left=new int[n];
//         left[0]=arr[0];
//         int[] right=new int[n];
//         right[n-1]=arr[n-1];
//         int k=n-2;
//         for(int i=1;i<n;i++){
//             left[i]=Math.max(left[i-1],arr[i]);
//             right[k]=Math.max(right[k+1],arr[k]);
//             k--;
//         }
//         int water=0;
//         for(int i=1;i<n-1;i++){
//             water+=Math.min(left[i],right[i])-arr[i];
//         }
//         return water;
        
//     }
// }
