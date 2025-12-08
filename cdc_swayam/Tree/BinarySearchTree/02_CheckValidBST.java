// class Solution {
//      TreeNode prev=null;
//     public boolean isValidBST(TreeNode root) {
//         boolean res=func(root);
//         return res;
//     }
   
//     boolean func(TreeNode root){
//         if(root==null)return true;
    
        
//         boolean a=func(root.left);
//         if(prev!=null&&root.val<=prev.val)return false;
//         if(prev==null)prev=root;
//         else if(prev!=null){
//             //System.out.println(prev.val+" "+root.val);
//             prev=root;
//         }
//         boolean b=func(root.right);
//         if(!a||!b)return false;
//         return true;
        
//     }
// }