// class Solution {
//     public int findMaxLength(int[] nums) {
//         int sum=0;
//         int res=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 nums[i]=-1;
//             }
//         }
//         HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//         mp.put(0,-1);
//         for(int i=0;i<n;i++){
//             sum+=nums[i];
//             if(mp.containsKey(sum-0)){
//                 res=Math.max(res,i-mp.get(sum-0));
//             }else{
//             mp.put(sum,i);
//             }
//         }
//         return res;
//     }
// }