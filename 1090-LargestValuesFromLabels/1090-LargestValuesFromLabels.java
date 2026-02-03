// Last updated: 2/3/2026, 12:12:43 PM
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
12    public int[] nextLargerNodes(ListNode head) {
13        Stack<Integer> st=new Stack<>();
14        List<Integer> ll=new ArrayList<>();
15        while(head!=null){
16            ll.add(head.val);
17            head=head.next;
18        }
19        int[] ans=new int[ll.size()];
20        for(int i=ll.size()-1;i>=0;i--){
21            while(!st.isEmpty() && st.peek()<=ll.get(i)){
22                st.pop();
23            }
24            if(st.isEmpty()){
25                ans[i]=0;
26            }
27            else{
28                ans[i]=st.peek();
29            }
30            st.push(ll.get(i));
31        }
32        return ans;
33    }
34}