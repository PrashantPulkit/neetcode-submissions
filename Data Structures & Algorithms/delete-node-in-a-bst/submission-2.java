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
    private TreeNode findNullRight(TreeNode root, TreeNode childTree){
        if(root==null){
            return childTree;
        }else{
            root.left = findNullRight(root.left, childTree);
            return root;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left = deleteNode(root.left,key);
            return root;
        } else if(key>root.val){
            root.right=  deleteNode(root.right,key);
            return root;
        }else{
           root = findNullRight(root.right, root.left);
           return root;
        }
    }
}