// class Solution {
//     public int aggressiveCows(int[] arr, int k) {
//         // code here
//         Arrays.sort(arr);
//         int min=Integer.MAX_VALUE;int max=0;
//         Arrays.sort(arr);
//         // System.out.println(Arrays.toString(arr));
        
//         for(int i:arr){
//             min=Math.min(min,i);max=Math.max(max,i);
//         }
//         int s=1;int e=(max-min);int mid=0;
//         while(s<=e){
//             mid=(s+(e-s)/2);
//             //  System.out.println(s+" "+mid+" "+e);
//             if(func(arr,mid,k)){
//                 s=mid+1;
//             }else{
//                 e=mid-1;
//             }
//         }
//         return e;
//     }
//     boolean func(int[] arr,int sum,int k){
//         k--;
//         int j=0;
//         for(int i=1;i<arr.length;i++){
//             // System.out.println(j);
//             if(arr[i]-arr[j]>=sum){
//                 k--;
//                 j=i;
//             }
//         }
//         //  System.out.println(k);
//         if(k<=0)return true;
//         return false;
//     }
// }