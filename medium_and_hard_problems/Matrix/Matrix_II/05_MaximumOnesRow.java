
// class Solution {
//     public int[] rowAndMaximumOnes(int[][] arr) {
        
//         int m=arr.length;int n=arr[0].length;
//         int count=0;
//         for(int i=0;i<m;i++){
//             int a=0;
//             for(int j=0;j<n;j++){
//                 if(arr[i][j]==1)a++;
//             }
//             count=Math.max(count,a);
//         }
//         for(int i=0;i<m;i++){
//             int a=0;
//             for(int j=0;j<n;j++){
//                 if(arr[i][j]==1)a++;
//             }
//             if(a==count)return new int[]{i,a};
//         }
//         return new int[]{0,0};
//     }
// }