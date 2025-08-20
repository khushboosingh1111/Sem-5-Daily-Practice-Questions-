// Last updated: 8/20/2025, 12:45:59 PM
/**
* Definition for singly-linked list.
*
*class ListNode {
*    int val;
*    ListNode next;
*    ListNode() {}
*    ListNode(int val) { this.val = val; }
*    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }*/
import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                return o1.val-o2.val;
            }
        });
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode r=pq.poll();
            dummy.next=r;
            dummy=dummy.next;
            if(r.next!=null){
                pq.add(r.next);
            }
        }
        return temp.next;
    }
}
