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
        ListNode fast = head;
        ListNode slow = head;
        while( fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            
        }
        ListNode mid = slow;
        ListNode head2 =reverseLL(mid);
        ListNode temp2 = head2;
        mid.next=null;
        ListNode head1 = head;
        ListNode temp = head1;

        while(head1.next != null && head2.next != null){
           ListNode next1 = head1.next;
ListNode next2 = head2.next;

head1.next = head2;
head2.next = next1;

head1 = next1;
head2 = next2;

        }

    }
    private ListNode reverseLL(ListNode node){
        if (node.next == null){
            return node;
        }

        ListNode nh = reverseLL(node.next);
        node.next.next= node;
        node.next = null;

        return nh;

    } 
}
