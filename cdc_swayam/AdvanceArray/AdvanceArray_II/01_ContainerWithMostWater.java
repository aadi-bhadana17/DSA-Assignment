// class Solution {
//     public int maxArea(int[] arr) {
//         int i=0;int j=arr.length-1;int res=0;
//         while(i<j){
//             if(arr[i]>=arr[j]){
//                 res=Math.max(res,(j-i)*Math.min(arr[i],arr[j]));
//                 j--;
//             }else{
//                 res=Math.max(res,(j-i)*Math.min(arr[i],arr[j]));
//                 i++;
//             }
//         }
//         return res;
//     }
// }
