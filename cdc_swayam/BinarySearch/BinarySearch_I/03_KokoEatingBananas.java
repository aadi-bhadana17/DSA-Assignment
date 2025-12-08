// class Solution {
//     public int minEatingSpeed(int[] arr, int h) {
//         int n=arr.length;
//         int s=1;int e=(int)Math.pow(10,9);
//         while(s<=e){
//             int mid=(s+(e-s)/2);
//             if(func(mid,arr,h)){
//                 e=mid-1;
//             }else{
//                 s=mid+1;
//             }
//         }
//         return s;
//     }
//     boolean func(int k,int[] arr,int h){
//         int res=0;int i=0;
//         while(i<arr.length){
//             int temp=arr[i];
//             if(temp%k==0){
//                 h=h-(temp/k);
//             }else{
//                 h=h-(temp/k+1);
//             }
//             i++;
//         }
//         if(h>=0)return true;
//         return false;
//     }
// }