// Last updated: 8/6/2025, 10:09:58 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode temp=head;
       while(head.next!=null){
        ListNode dum=new ListNode();
        dum.val=GCD(head.val,head.next.val);
        dum.next=head.next;
        head.next=dum;
        head=dum.next;

       }
       return temp;
    }
    public int GCD(int divisor, int dividend) {
		
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}
}