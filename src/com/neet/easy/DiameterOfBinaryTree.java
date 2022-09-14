package com.neet.easy;

public class DiameterOfBinaryTree {

    int result = -1;

    /**
     * Definition for a binary tree node.
     **/
    public class TreeNode {
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

    public int diameterOfBinaryTree(TreeNode root) {

        // find longest path on left sub tree and longest path on right subtree
        //add length of both subtrees

        dfsHeight(root);
        return result;

    }

    private int dfsHeight(TreeNode node) {
        //base case
        if (node == null) {
            return -1;
        }

        int left = 1 + dfsHeight(node.left);
        int right = 1 + dfsHeight(node.right);

        result = Math.max(result, left+right);

        return Math.max(left, right);

    }
}
