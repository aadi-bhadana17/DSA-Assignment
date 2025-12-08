// class Solution {
//      int diameter=0;
//     public int diameterOfBinaryTree(TreeNode root) {
//         int h=func(root);
//         return diameter;
//     }
//     int func(TreeNode root){
//         if(root==null)return 0;
//         int lh=func(root.left);
//         int rh=func(root.right);
//         diameter=Math.max(diameter,lh+rh);
//         return Math.max(lh,rh)+1;
//     }
   
// }
