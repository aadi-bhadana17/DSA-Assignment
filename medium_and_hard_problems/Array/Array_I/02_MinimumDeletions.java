// class Solution {
//     public int minimumDeletions(int[] arr) {
//         int n=arr.length;
//         int max=-1;int min=-1;
//         for(int i=0;i<n;i++){
//             if(max==-1||arr[i]>arr[max]){
//                 max=i;
//             }
//             if(min==-1||arr[i]<arr[min]){
//                 min=i;
//             }
//         }
//         if(min==max){
//             return Math.max(min+1,n-min);
//         }
//         int a=0;
//         if(min>max){
//             a=n-min+max+1;
//         }else{
//             a=n-max+min+1;
//         }
//         a=Math.min(a,Math.min(Math.max(min+1,max+1),Math.max(n-min,n-max)));
//         return a;
//     }
// }