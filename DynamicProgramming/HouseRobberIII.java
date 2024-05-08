// Problem Link : https://leetcode.com/problems/house-robber-iii/description/
 
 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class Solution {
    public int rob(TreeNode root) {
        int []ans = traverse(root);
        return Math.max(ans[0],ans[1]);
    }

    public int[] traverse(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int []leftChoice = traverse(root.left);
        int []rightChoice = traverse(root.right);
        int []ans = new int[2];
        ans[0] = root.val+leftChoice[1]+rightChoice[1]; // robbing current node
        ans[1] = Math.max(leftChoice[0],leftChoice[1])+Math.max(rightChoice[0], rightChoice[1]);
        // not robbing current node
        return ans;
    }
}