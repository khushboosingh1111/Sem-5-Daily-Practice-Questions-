// Last updated: 8/6/2025, 10:10:53 AM
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode tail = list2;

        while(tail.next!=null){

            tail = tail.next;

        }

        ListNode temp1 = list1;

        int count = 0;

        while(list1.next!=null){

            if(count==a-1){

                ListNode temp = list1.next;

                list1.next = list2;

                list1 = temp;

            }else if(count == b) {

                tail.next=list1.next;

                list1.next=null;

            }else list1 = list1.next;

            count++;

        }

        return temp1;

        

    }

}