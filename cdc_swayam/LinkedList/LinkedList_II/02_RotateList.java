// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null)return null;
//         ListNode curr=head;int n=0;
//         while(curr!=null){
//             curr=curr.next;n++;
//         }
//         k=k%n;
//         int a=n-(k);
//         ListNode first=head;
//         curr=head;
//         for(int i=0;i<a-1;i++){
//             curr=curr.next;
//         }
//         ListNode second=curr.next;
//         curr.next=null;
//         first=reverse(head);
//         second=reverse(second);
//         curr=first;
//         while(curr.next!=null)curr=curr.next;
//         curr.next=second;
//         return reverse(first);
//     }
//         ListNode reverse(ListNode head){
//         if(head==null)return null;
//         ListNode curr=head;
//         ListNode prev=null;
//         while(curr!=null){
//             ListNode temp=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=temp;
//         }
//         return prev;
//     }

// }
