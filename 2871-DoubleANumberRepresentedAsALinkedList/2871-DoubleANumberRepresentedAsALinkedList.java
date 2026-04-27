// Last updated: 4/27/2026, 10:52:20 PM
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
public class Solution {
    public ListNode doubleIt(ListNode head) {
        // If the value of the head node is greater than 4, 
        // insert a new node at the beginning
        if (head.val > 4) {
            head = new ListNode(0, head);
        }
        
        // Traverse the linked list
        for (ListNode node = head; node != null; node = node.next) {
            // Double the value of the current node 
            // and update it with the units digit
            node.val = (node.val * 2) % 10;
            
            // If the current node has a next node 
            // and the next node's value is greater than 4,
            // increment the current node's value to handle carry
            if (node.next != null && node.next.val > 4) {
                node.val++;
            }
        }
        
        return head;
    }
}