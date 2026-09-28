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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        diameterOfBinaryTree(root,1);
        return this.diameter;
    }
    private  int diameterOfBinaryTree(TreeNode root,int num){
        if(root==null){
            return num;
        }
        num++;
        int temp1 = diameterOfBinaryTree(root.left,num);
        int temp2=diameterOfBinaryTree(root.right,num);
        int tempdia= temp1+temp2-(2*num) ;
        if(tempdia>this.diameter){
            this.diameter=tempdia;
        }
        return Math.max(temp1,temp2);

    }
}
