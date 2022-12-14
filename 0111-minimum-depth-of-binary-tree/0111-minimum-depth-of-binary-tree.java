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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int leftLevel = minDepth(root.left);
        int rightLevel = minDepth(root.right);
        
        if(leftLevel == 0 && rightLevel == 0){
            return 1;
        }else if(leftLevel == 0 ){
            return rightLevel+1;
        }else if(rightLevel == 0){
            return leftLevel+1;
        }else{
            return Math.min(leftLevel,rightLevel)+1;
        }
    }
}