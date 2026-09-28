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
    int max = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return maxDepth(root,1);
        
       
    }
    public int maxDepth(TreeNode root,int num) {
       if(root == null){
            return num-1;
        }
        
        int temp1 = maxDepth(root.left,num+1);
        int temp2=maxDepth(root.right,num+1);
        if(temp1<temp2){
            num =temp2;
        } else{
            num=temp1;
        }
        return num;
    }
    
}
