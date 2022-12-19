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
    List<List<Integer>> paths = new ArrayList<>(); 
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root != null){
            dfs(root,targetSum,new ArrayList<>());
        }
        return paths;
    }
    void dfs(TreeNode node, int targetSum, List<Integer> path){
        
        targetSum -= node.val;
        path.add(node.val);
        
        if(node.right == null && node.left == null){
            System.out.println(path);
            if(targetSum == 0){
                paths.add(new ArrayList<>(path));
            }
        }

        if(node.left != null)   dfs(node.left, targetSum, path);
        if(node.right != null)  dfs(node.right, targetSum, path);
        path.remove(path.size()-1);
    }
    
    
}