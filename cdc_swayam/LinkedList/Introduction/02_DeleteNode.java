// class Solution {
//     public void deleteNode(ListNode node) {
//         // System.out.println(node.val);
//         ListNode prev=null;
//         while(node.next!=null){
//             prev=node;
//             node.val=node.next.val;
//             node=node.next;
//         }
//         prev.next=null;
//     }
// }