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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        while(n1!=null && n2!=null){
           int value = n1.val+n2.val+carry;
           int value2 = value%10;
           carry = value/10;
           dummy.next = new ListNode(value2);
           dummy = dummy.next;
           n1=n1.next;
           n2=n2.next;


        }
        while(n1!=null){
            int value = n1.val +carry;
            int value2 = value%10;
           carry = value/10;
           dummy.next = new ListNode(value2);
           dummy = dummy.next;
           n1 = n1.next;

        }
        while(n2!=null){
            int value = n2.val+carry;
             int value2 = value%10;
           carry = value/10;
           dummy.next = new ListNode(value2);
           dummy = dummy.next;
           n2 = n2.next;

        }
        if(carry==1){

            dummy.next = new ListNode(1);
            dummy = dummy.next;
            
        }
        dummy.next=null;
        return ans.next;
    }
}
