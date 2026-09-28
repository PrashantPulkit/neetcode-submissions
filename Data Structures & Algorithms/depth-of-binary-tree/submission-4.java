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
        return maxDepth(root,0);
        
       
    }
    public int maxDepth(TreeNode root,int num) {
       if(root == null){
            return num;
        }
        num++;
        int temp1 = maxDepth(root.left,num);
        int temp2=maxDepth(root.right,num);
        if(temp1<temp2){
            num =temp2;
        } else{
            num=temp1;
        }
        return num;
    }
    
}
