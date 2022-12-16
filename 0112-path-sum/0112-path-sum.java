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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }else{
            return dfs(root, targetSum, 0);
        }
    }
    
    boolean dfs(TreeNode node, int targetSum, int sum){
        sum = sum + node.val;
        if(isLeaf(node)){
            System.out.println(sum);
            if(targetSum == sum){
                return true;
            }else{
                return false;
            }
        }
        boolean result = false;
        if(node.left != null)  result = result || dfs(node.left, targetSum, sum);
        if(node.right != null)  result = result || dfs(node.right, targetSum, sum);
        
        return result;
    }
    
    boolean isLeaf(TreeNode node){
        if(node.left == null && node.right == null){
            return true;
        }else{
            return false;
            
        }
    }
}