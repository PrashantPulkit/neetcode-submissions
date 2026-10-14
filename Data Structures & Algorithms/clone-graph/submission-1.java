/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer,Node> cloned ;
    public Node cloneGraph(Node node) {
       this.cloned = new HashMap<>();

      if(node == null){return null;}
      return clone(node);

    }
    private Node clone(Node node){
    if(cloned.containsKey(node.val)){
        return cloned.get(node.val);
    }
    Node node1 = new Node();
    node1.val=node.val;
    cloned.put(node1.val,node1);
    for(Node n : node.neighbors){
        node1.neighbors.add(clone(n));
    }
    return node1;
    
    }

}