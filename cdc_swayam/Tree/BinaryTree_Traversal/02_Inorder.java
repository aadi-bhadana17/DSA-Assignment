// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> n=new ArrayList<>();
//         inorder(root,n);
//         return n;
//     }
//     static void inorder(TreeNode root,List<Integer> n){
//         if(root==null)return ;
//         inorder(root.left,n);
//         n.add(root.val);
//         inorder(root.right,n);
//     }
// }