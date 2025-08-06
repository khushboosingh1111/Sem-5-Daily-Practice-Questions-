// Last updated: 8/6/2025, 10:15:00 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode ohead=head;
        ListNode ehead=head.next;
        ListNode ev=ehead;
        while(ohead.next!=null && ehead.next!=null){
            ohead.next=ehead.next;
            ohead=ohead.next;
            ehead.next=ohead.next;
            ehead=ehead.next;
        }
        ohead.next=ev;
        return head;
    }
}