// Last updated: 6/15/2026, 12:04:03 AM
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
11class Solution {
12    public int pairSum(ListNode head) {
13        ListNode slow = head, fast = head, prev = null;
14
15        while (fast != null && fast.next != null) {
16            fast = fast.next.next;
17            ListNode temp = slow.next;
18            slow.next = prev;
19            prev = slow;
20            slow = temp;
21        }
22
23        int res = 0;
24        while (slow != null) {
25            res = Math.max(res, prev.val + slow.val);
26            prev = prev.next;
27            slow = slow.next;
28        }
29
30        return res;
31    }
32}