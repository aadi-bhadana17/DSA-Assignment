// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         if(root==null)return new ArrayList<>();
//         List<List<Integer>> n=new ArrayList<List<Integer>>();
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         List<Integer> temp=new ArrayList<Integer>();temp.add(root.val);
//         n.add(temp);
//         while(q.isEmpty()==false){
//             int count=q.size();
//             List<Integer> res=new ArrayList<>();
//             for(int i=0;i<count;i++){
//                 TreeNode x=q.remove();
//                 if(x.left!=null){
//                     res.add(x.left.val);q.add(x.left);
//                 }
//                 if(x.right!=null){
//                     res.add(x.right.val);q.add(x.right);
//                 }
//             }
//             if(q.isEmpty()==false)
//             n.add(res);
            
//         }
//         return n;
//     }
// }

