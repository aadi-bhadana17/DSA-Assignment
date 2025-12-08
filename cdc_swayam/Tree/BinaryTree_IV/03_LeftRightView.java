// class Solution {
//     int maxlevel=-1;
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> arr=new ArrayList<Integer>();
//         func(root,0,arr);
//         return arr;
//     }
//     void func(TreeNode root,int level,List<Integer> arr){
//         if(root==null)return;

//         if(level>maxlevel){
//             arr.add(root.val);maxlevel=level;
//         }
//         func(root.right,level+1,arr);
//         func(root.left,level+1,arr);
//     }
// }