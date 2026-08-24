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

//Given the root of a binary tree, return its depth. 
//The depth of a binary tree is defined as the number of nodes along the longest path from the root node down to the farthest leaf node. 

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftSide = maxDepth(root.left) + 1;
        int rightSide = maxDepth(root.right) + 1;

        return Math.max(leftSide, rightSide);
    }
}
