// class Solution {
//     int maxLength(int arr[]) {
//         // code here
//         int n=arr.length;
//         HashMap<Integer,Integer> mp=new HashMap<>();
//         mp.put(0,-1);
//         int res=0;int sum=0;
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//             if(mp.containsKey(sum)){
//                 res=Math.max(res,i-mp.get(sum));
//             }else{
//                 mp.put(sum,i);
//             }
//         }
//         return res;
//     }
// }