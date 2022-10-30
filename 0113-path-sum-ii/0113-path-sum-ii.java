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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();        
        List<List<Integer>>  ans = new ArrayList<>();
        
        helper(root, targetSum, ans, res);
        return ans;
    }
    
    private void helper(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> res){
        if(root == null)
            return;
        
        res.add(root.val);
        if(root.val == targetSum && root.left == null && root.right == null){
            ans.add(new ArrayList<>(res));
        }
        
        helper(root.left, targetSum - root.val, ans, res);
        if(root.left != null)
            res.remove(res.size() - 1);
        helper(root.right, targetSum - root.val ,ans, res);
        if(root.right != null)
            res.remove(res.size() - 1);
    }
}