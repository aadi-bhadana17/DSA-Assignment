// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         char[] arr=s.toCharArray();
//         int n=s.length();int k=0;
//         HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
//         int res=0;
//         for(int i=0;i<n;i++){
//             char temp=arr[i];
//             if(mp.containsKey(temp)){
//                 int len=mp.get(temp);
//                 while(k<=len){
//                     mp.remove(arr[k++]);
//                 }
//             }
//             mp.put(temp,i);
//             res=Math.max(res,mp.size());
//         }
//         return res;
//     }
// }