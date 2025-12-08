// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         int m=arr.length;
//         int n=arr[0].length;
//         int[] col=new int[m];
//         for(int i=0;i<m;i++)col[i]=arr[i][0];

//         int x=search(col,target);
//         if(x<0||x>=m)return false;
//         int[] k=arr[x];
//         int s=0;
//         int  e=k.length-1;
//         int mid=0;
//         while(s<=e){
//             mid=s+(e-s)/2;
//             if(k[mid]>target){
//                 e=mid-1;
//             }else if(k[mid]<target){
//                 s=mid+1;
//             }else{
//                 return true;
//             }
//         }
//         return false;
//     }
//     int search(int[] arr,int target){
//         int s=0;
//         int  e=arr.length-1;
//         int mid=0;
//         while(s<=e){
//             mid=s+(e-s)/2;
//             if(arr[mid]>target){
//                 e=mid-1;
//             }else if(arr[mid]<target){
//                 s=mid+1;
//             }else{
//                 return mid;
//             }
//         }
//         return e;
//     }
// }
