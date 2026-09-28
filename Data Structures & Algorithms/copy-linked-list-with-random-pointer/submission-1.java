/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        int i =1;
        Node node = head;
        Node headcopy = new Node(head.val);
        Node nodecopy = headcopy;
        HashMap<Node,Node> nodes = new HashMap<>();
        
        nodes.put(node,nodecopy);

        while(node.next !=null ){
            Node temp =  new Node(node.next.val);
            nodecopy.next = temp;
            nodecopy = temp;
            node = node.next;
            nodes.put(node,nodecopy);
            
           
        }
        node = head;
        nodecopy = headcopy;
        while(node !=null){
            
            nodecopy.random = nodes.get(node.random);
            node = node.next;
            nodecopy= nodecopy.next;

        }
        return headcopy;
    }
}
