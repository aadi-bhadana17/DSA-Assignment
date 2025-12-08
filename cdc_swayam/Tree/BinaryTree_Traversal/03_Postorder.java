// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//            List<Integer> n=new ArrayList<Integer>();
//            postorder(root,n);
//            return n;
//     }
//     static void postorder(TreeNode root,List<Integer> n){
//         if(root==null)return;
        
//         postorder(root.left,n);
//         postorder(root.right,n);
//         n.add(root.val);

//     }
    
// }
