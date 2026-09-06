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
private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
       calculateHeightAndDiameter(root);
       return maxDiameter;  
    }
    private int calculateHeightAndDiameter(TreeNode node){
        if(node == null) return 0;

        int leftHeight = calculateHeightAndDiameter(node.left);
        int rightHeight = calculateHeightAndDiameter(node.right);

        int  diameterThroughNode = leftHeight + rightHeight;

        maxDiameter = Math.max(maxDiameter, diameterThroughNode);
          return 1 + Math.max(leftHeight, rightHeight);
    }
}