// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null)return null;
//         ListNode j=head;
//         ListNode curr=head.next;
//         while(curr!=null){
//             if(curr.val!=j.val){
//                 j.next=curr;
//                 j=j.next;curr=curr.next;
//             }else{
//                 curr=curr.next;
//             }
//         }
//         j.next=null;
//         return head;
//     }
// }