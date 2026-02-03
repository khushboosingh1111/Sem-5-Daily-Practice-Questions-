// Last updated: 2/3/2026, 12:03:16 PM
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
13        List<Integer> ll=new ArrayList<>();
14        Stack<Integer> st=new Stack<>();
15       
16        while(head!=null){
17            ll.add(head.val);
18            head=head.next;
19        } 
20        int[] ans=new int[ll.size()];
21        for(int i=ll.size()-1;i>=0;i--){
22            while(!st.isEmpty() && st.peek()<=ll.get(i)){
23                st.pop();
24            }
25            if(st.isEmpty()){
26                ans[i]=0;
27            }
28            else{
29                ans[i]=st.peek();
30            }
31            st.push(ll.get(i));
32        }
33        return ans;
34        
35    }
36}