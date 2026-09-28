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
    int pos;
    public ListNode removeNthFromEnd(ListNode head, int n) {
    this.pos=n;
    ListNode head2 = removenth(head);
    return head2;
    }
    private ListNode removenth(ListNode node){
        if(node.next==null ){
            if(this.pos==1){
                return null;
            }
            return node;
            
        }else{
            ListNode temp = removenth(node.next);
            pos-=1;
            if(pos==1){
                return temp;
            }
            node.next =temp;
            return node;
            
        }
    }
}
