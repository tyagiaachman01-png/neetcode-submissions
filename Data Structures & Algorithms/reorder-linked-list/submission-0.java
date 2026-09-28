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
    public void reorderList(ListNode head) {

        Deque<ListNode> q1= new ArrayDeque<>();
        ListNode n1 = head;

        while(n1!=null){
            q1.offer(n1);
            n1= n1.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        while(q1.size()>1){
            ListNode first = q1.pollFirst();
            ListNode last = q1.pollLast();
            dummy.next= first;
            dummy= dummy.next;
            dummy.next= last;
            dummy=dummy.next;

        }
        if(q1.size()==1){
            dummy.next = q1.pollFirst();
            dummy= dummy.next;
            dummy.next=null;
        }
        else{
            dummy.next = null;
        }
        head = ans.next;
    }
}
