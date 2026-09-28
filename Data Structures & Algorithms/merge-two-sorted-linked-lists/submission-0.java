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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2= list2;
        ListNode dummy = new ListNode(0);
        ListNode dummy2 = dummy;
        while(n1!=null && n2!= null){
            if(n1.val>n2.val){
                dummy.next= n2;
                dummy = dummy.next;
                n2= n2.next;

            }
            else{
                dummy.next=n1;
                dummy=dummy.next;
                n1= n1.next;
            }

        }
        if(n1!=null){
            dummy.next= n1;

        }
        if(n2!=null){
            dummy.next=n2;
        }
        return dummy2.next;
    }
}