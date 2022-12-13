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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    
    int dfs(TreeNode node){
        if(node == null || !flag){
            return 0;
        }
        
        int leftTreeLevel = dfs(node.left)+1;
        int rightTreeLevel = dfs(node.right)+1;
        
        if(Math.abs(leftTreeLevel - rightTreeLevel) > 1){
            flag = false;
        }
        
        return Math.max(leftTreeLevel, rightTreeLevel);
    }
}