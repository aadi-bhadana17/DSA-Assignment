// class Solution {
//     public TreeNode createBinaryTree(int[][] arr) {
//         int n=arr.length;
//         HashMap<Integer,TreeNode> s=new HashMap<>();
//         TreeNode res=null;
//         HashSet<Integer> check=new HashSet<Integer>();
//         for(int i=0;i<n;i++){
//             int[] temp=arr[i];
//             check.add(temp[1]);
//             TreeNode x=new TreeNode(temp[1]);
//             if(s.containsKey(temp[0])&&!s.containsKey(temp[1])){
//                 TreeNode parent=s.get(temp[0]);
//                 if(temp[2]==1){
//                     parent.left=x;
//                 }else{
//                     parent.right=x;
//                 }
//                 s.put(temp[1],x);
//             }else if(s.containsKey(temp[0])&&s.containsKey(temp[1])){
//                 TreeNode c=s.get(temp[1]);
//                  TreeNode parent=s.get(temp[0]);
//                 if(temp[2]==1){
//                     parent.left=c;
//                 }else{
//                     parent.right=c;
//                 }
//             }
//             else if(s.containsKey(temp[1])){
//                  TreeNode child=s.get(temp[1]);
//                  TreeNode parent=new TreeNode(temp[0]);
//                 if(temp[2]==1)parent.left=child;
//                 else parent.right=child;
//                 s.put(temp[0],parent);
//             }
//             else{
//                 TreeNode parent=new TreeNode(temp[0]);
//                  if(temp[2]==1){
//                     parent.left=x;
//                 }else{
//                     parent.right=x;
//                 }
//                 s.put(temp[1],x);
//                 s.put(temp[0],parent);
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(check.contains(arr[i][0])==false){
//                 return s.get(arr[i][0]);
//             }
//         }
//         return null;
//     }
// }