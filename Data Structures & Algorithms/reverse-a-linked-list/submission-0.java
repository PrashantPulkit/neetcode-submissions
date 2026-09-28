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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        else{
 ListNode h = helper(head.next,head);
 head.next= null;
 return h;
        }
       
        
    }
    private ListNode helper(ListNode current,ListNode previous){
        if(current.next==null){
           current.next=previous;
           return current;
        }
        else{
            ListNode h = helper(current.next,current);
            current.next=previous;
            return h;
        }
    }
}
