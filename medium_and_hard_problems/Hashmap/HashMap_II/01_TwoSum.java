// class Solution {
//     public int[] twoSum(int[] arr, int target) {
//         HashMap<Integer,Integer> s=new HashMap<Integer,Integer>();    
//         for(int i=0;i<arr.length;i++){
//             if(s.containsKey(target-arr[i])){
//                 return new int[]{s.get(target-arr[i]),i};
//             }else{
//                 s.put(arr[i],i);
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }