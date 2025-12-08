
// class Solution {
//     public int[] intersection(int[] num1, int[] num2) {
//         HashSet<Integer> a=new HashSet<>();
//         HashSet<Integer> s=new HashSet<Integer>();
//         for(int i:num1){
//             s.add(i);
//         }
//         for(int j:num2){
//             if(s.contains(j))a.add(j);
//         }
//         int[] res=new int[a.size()];
//         int k=0;
//         for(int i:a)res[k++]=i;
//         return res;
//     }
// }