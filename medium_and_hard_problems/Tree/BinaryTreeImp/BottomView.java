// class pair{
//     Node root;
//     int index;
//     pair(Node a,int b){
//         root=a;
//         index=b;
//     }
// }
// class Solution {
//     public ArrayList<Integer> bottomView(Node root) {
//         // code here
//         HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//         ArrayList<Integer> res=new ArrayList<Integer>();
//         Queue<pair> q=new LinkedList<>();
//         q.add(new pair(root,0));
//         while(!q.isEmpty()){
//             pair temp=q.remove();
//             Node x=temp.root;int k=temp.index;
//             mp.put(k,x.data);
//             if(x.left!=null){
//                 q.add(new pair(x.left,k-1));
//             }
//             if(x.right!=null){
//                 q.add(new pair(x.right,k+1));
//             }
//         }
//         // System.out.println(mp);
//         int[][] arr=new int[mp.size()][2];int t=0;
//         for(Map.Entry<Integer,Integer> e:mp.entrySet()){
//             arr[t++]=new int[]{e.getKey(),e.getValue()};
//         }
//         Arrays.sort(arr,(a,b)->(a[0]-b[0]));
//         for(int i=0;i<arr.length;i++){
//             res.add(arr[i][1]);
//         }
//         return res;
//     }
// }