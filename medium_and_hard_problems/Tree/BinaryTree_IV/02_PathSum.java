// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetsum) {
//        if(root==null)return false;
//        return pathsum(root,targetsum);
//     }
//     static boolean pathsum(TreeNode root,int targetsum){
//          if(root==null)return false;
//          if(root.left==null&&root.right==null){
//             if(targetsum-root.val==0)return true;
//          }

//         return pathsum(root.left,targetsum-root.val)||pathsum(root.right,targetsum-root.val);
//     }
// }