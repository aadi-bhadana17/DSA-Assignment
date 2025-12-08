// class Solution {
//     public int findSubarray(int[] arr) {
//         int n=arr.length;
//         HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//         int sum=0;
//         mp.put(0,1);int res=0;
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//             if(mp.containsKey(sum)){
//                 res+=mp.get(sum);
//                 mp.put(sum,mp.getOrDefault(sum,0)+1);
//             }else{
//                 mp.put(sum,1);
//             }
//         }
//         return res;
//     }
// }
