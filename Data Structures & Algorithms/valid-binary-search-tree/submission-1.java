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
    public boolean isValidBST(TreeNode root) {
        if(root == null ){
            return true;
        }
        
        return isValidBST(root, Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public boolean isValidBST(TreeNode root,int max,int min){
        if(root == null ){
            return true;
        }
        if((root.val>min &&root.val<max)){
        return isValidBST(root.left,root.val,min ) && isValidBST(root.right, max,root.val);
        }
        return false;
    }
}
