// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if(head==null)return null;
//         ListNode curr=head;
//         ListNode mid=head;
//         while(curr!=null&&curr.next!=null){
//             curr=curr.next.next;
//             mid=mid.next;
//         }
//         return mid;
//     }
// }
