// Last updated: 2/3/2026, 11:45:24 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11public class Solution {
12    public ListNode doubleIt(ListNode head) {
13        // If the value of the head node is greater than 4, 
14        // insert a new node at the beginning
15        if (head.val > 4) {
16            head = new ListNode(0, head);
17        }
18        
19        // Traverse the linked list
20        for (ListNode node = head; node != null; node = node.next) {
21            // Double the value of the current node 
22            // and update it with the units digit
23            node.val = (node.val * 2) % 10;
24            
25            // If the current node has a next node 
26            // and the next node's value is greater than 4,
27            // increment the current node's value to handle carry
28            if (node.next != null && node.next.val > 4) {
29                node.val++;
30            }
31        }
32        
33        return head;
34    }
35}