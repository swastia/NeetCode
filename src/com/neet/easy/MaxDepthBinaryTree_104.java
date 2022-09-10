package com.neet.easy;

/*
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 * */

public class MaxDepthBinaryTree_104 {
    /**
     * Definition for a binary tree node.
     **/
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /* Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 42.9 MB, less than 65.26% of Java online submissions for Maximum Depth of Binary Tree.
*/
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 0);
    }

    private int findMaxDepth(TreeNode node, int height){
        //base case
        if(node == null){
            return height;
        }
        height++;

        return  Math.max(findMaxDepth(node.left,height), findMaxDepth(node.right,height));

    }

    // Below is another improved version of above code, with less time complexity
    // we are still using Recursive DFS, but there is no need to pass the height or count around.
    // function should always return 1 + (max(L, R) height of rest of the sub-tree)
    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
