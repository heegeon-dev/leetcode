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
    TreeNode prev = null;
    public boolean isValidBST(TreeNode node) {
        boolean result = true;
        if(node == null){
            return true;
        }

        result = result && isValidBST(node.left);
        if(prev!=null && prev.val >= node.val){
            result = false;
        }
        prev = node;
        result = result &&isValidBST(node.right);
        
        return result;
        
    }
}