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
        
        if(node == null){
            return true;
        }

        boolean result = isValidBST(node.left);
        if(result && prev!=null && prev.val >= node.val){
            result = false;
        }
        prev = node;
        return result && isValidBST(node.right);
        
    }
}