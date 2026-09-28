/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int good =0;
    public int goodNodes(TreeNode root) {
        dfs(root,Integer.MIN_VALUE);
        return this.good;
    }
    public void dfs(TreeNode node, int pathmax){
        if(node == null){
            return; 
        }
        if(node.val >=pathmax){
            pathmax = node.val;
            this.good++;
        }
        dfs(node.left, pathmax);
        dfs(node.right,pathmax);
        
    }
}
