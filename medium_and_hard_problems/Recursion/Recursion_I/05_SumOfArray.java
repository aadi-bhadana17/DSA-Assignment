// class Solution {
//     int arraySum(int arr[]) {
//         // code here
//         int n=arr.length;
//         return func(arr,n-1);
//     }
//     static int func(int[] arr,int i){
//         if(i==-1)return 0;
//         else return arr[i]+=func(arr,i-1);
//     }
// }