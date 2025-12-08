// class Solution {
//     public int sumOfLeftLeaves(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//         TreeNode r=func(root);
//         return sum;
//     }
//     int sum=0;
//     TreeNode func(TreeNode root){
//         if(root==null)return null;
//         TreeNode l=func(root.left);
//         TreeNode r=func(root.right);
//         if(l!=null&&l.left==null&&l.right==null){
//             sum+=l.val;
//         }
//         return root;
//     }
// }