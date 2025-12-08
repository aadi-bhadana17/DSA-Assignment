// class pair{
//     int num;
//     Node curr;
//     pair(int a,Node b){
//         num=a;
//         curr=b;
//     }
// }
// class Solution {
//     public ArrayList<Integer> topView(Node root) {
//         // code here
//         HashMap<Integer,Integer> mp=new HashMap<>();
//         Queue<pair> q=new LinkedList<>();
//         q.add(new pair(0,root));
//         ArrayList<Integer> res=new ArrayList<Integer>();
//         while(q.isEmpty()==false){
//             pair x=q.remove();Node node=x.curr;
//             int temp=x.num;
//             if(mp.containsKey(temp)==false)mp.put(temp,node.data);
//             if(node.left!=null){
//                 q.add(new pair(temp-1,node.left));
//             }
//             if(node.right!=null){
//                 q.add(new pair(temp+1,node.right));
//             }
//         }
//         //System.out.println(mp);
//         ArrayList<int[]> arr=new ArrayList<>();
//         for(Map.Entry<Integer,Integer> e:mp.entrySet()){
//             arr.add(new int[]{e.getKey(),e.getValue()});
//         }
//         Collections.sort(arr,(a,b)->(a[0]-b[0]));
//         for(int i=0;i<arr.size();i++){
//             res.add(arr.get(i)[1]);
//         }
     
        
//         return res;
//     }
// }