// class Solution {
//     public int[] topKFrequent(int[] arr, int k) {
//         HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//         for(int i:arr){
//             mp.put(i,mp.getOrDefault(i,0)+1);
//         }
//         PriorityQueue<int[]> q=new PriorityQueue<int[]>((a,b)->(b[1]-a[1]));
//         for(Map.Entry<Integer,Integer> e:mp.entrySet()){
//             int[] temp={e.getKey(),e.getValue()};
//             q.add(temp);
//         }
//         int[] res=new int[k];
//         int x=0;
//         while(k>0){
//             int[] temp=q.remove();
//             res[x++]=(temp[0]);
//             k--;
//         }
//         return res;
//     }
// }