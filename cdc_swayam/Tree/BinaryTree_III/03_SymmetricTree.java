// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         while(q.isEmpty()==false){
//             int count=q.size();
//             ArrayList<int[]> s=new ArrayList<int[]>();
//             for(int i=0;i<count;i++){
//                 TreeNode temp=q.remove();
//                 if(temp.left!=null){
//                     q.add(temp.left);
//                     s.add(new int[]{temp.left.val,0});
//                 }else{
//                     s.add(new int[]{-2000,0});
//                 }
//                 if(temp.right!=null){
//                     q.add(temp.right);
//                     s.add(new int[]{temp.right.val,1});
//                 }else{
//                     s.add(new int[]{-2000,1});
//                 }
//             }
//             int st=0;int en=s.size()-1;
//             while(st<en){
//                 int[] a=s.get(st);
//                 int[] b=s.get(en);
//                 if(a[0]!=b[0]||a[1]==b[1])return false;
//                 st++;en--;
//             }
//             //System.out.println(s);
//         }
//         return true;
//     }
// }
