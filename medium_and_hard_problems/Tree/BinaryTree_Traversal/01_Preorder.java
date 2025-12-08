// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> n=new ArrayList<Integer>();
//         preorder(root,n);
//         return n;
//     }
//     static void preorder(TreeNode root,List<Integer> n){
//         if(root==null)return;
//         n.add(root.val);
//         preorder(root.left,n);
//         preorder(root.right,n);

//     }
// }