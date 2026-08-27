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

//Given a binary tree root, return the level order traversal of it as a nested list, where each sublist contains the values of nodes at a particular level in the tree, from left to right. 
class Solution {

    //return with nexted list. 
    //for example. [1], [2, 3], [4, 5, 6, 7]
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root); //queue [1] result []
        
        while(!queue.isEmpty()){
             List<Integer> currentLevel = new ArrayList<>();
             int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
        TreeNode current = queue.poll();
        currentLevel.add(current.val); //currentLevel [1]
        if(current.left != null){
        queue.offer(current.left); //1.left and 1.right
        }
        if(current.right != null){
        queue.offer(current.right); //queue [2, 3]
        }       
            }
            result.add(currentLevel);
            currentLevel = new ArrayList<>();
        }
        //levelsize is 1. 
        //i = 0 so i < 1. current got 1. currentLevel add 1. queue [2, 3]
        //levelSize = 2. current = 2 currentLevel [2] queue [3, 4, 5]
        //current = 3 currentLevel [2, 3] queue [4, 5, 6, 7]
        //current = 4. currentLevel[4] queue [5, 6, 7] 
        //current = 5. currentLevel[4, 5] queue [6, 7]
        //current = 6. currentLevel [4, 5, 6] queue [7]
        //current = 7. currentLevel [4, 5, 6, 7] queue []
        
        return result; 
    }
}

