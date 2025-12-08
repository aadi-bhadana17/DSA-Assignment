// class Solution {
//     public int[] maxSlidingWindow(int[] arr, int k) {
//         int n=arr.length;
//         int len=n-k+1;
//         int[] res=new int[len];
//         int sum=0;
//         HashMap<Integer,Integer> mp=new HashMap<>();
//         PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
//         int j=0;int i=0;
//         while(j<k){
//             mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
//             q.add(arr[j]);j++;
//         }
//         res[0]=q.peek();
        
//         // System.out.println(len+" "+j);
//          for(int t=1;t<len;t++){
//             mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
//             q.add(arr[j++]);
//             mp.put(arr[i],mp.getOrDefault(arr[i],0)-1);
//             while(!q.isEmpty()&&mp.getOrDefault(q.peek(),0)==0){
//                 q.poll();
//             }
//             i++;
//                res[t]=q.peek();
//          }
//         return res;
//     }
// }