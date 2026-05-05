// Last updated: 5/5/2026, 7:07:47 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) {
14            return head;
15        }
16        // Step 1: find length and tail
17        int n = 1;
18        ListNode tail = head;
19        while (tail.next != null) {
20            tail = tail.next;
21            n++;
22        }
23        // Step 2: reduce k
24        k = k % n;
25        if (k == 0) {
26            return head;
27        }
28        // Step 3: make circular
29        tail.next = head;
30        // Step 4: find new tail
31        int steps = n - k;
32        ListNode newTail = head;
33        for (int i = 1; i < steps; i++) {
34            newTail = newTail.next;
35        }
36        // Step 5: break
37        ListNode newHead = newTail.next;
38        newTail.next = null;
39        return newHead;
40    }
41}