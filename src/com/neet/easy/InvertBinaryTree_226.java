package com.neet.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertBinaryTree_226 {

    /**
     * Definition for a binary tree node.
     * */
      private static class TreeNode {
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

/*
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
Memory Usage: 41.7 MB, less than 49.74% of Java online submissions for Invert Binary Tree.
* */
    public TreeNode invertTree(TreeNode root) {
        TreeNode current = root;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(current);

        while(!nodes.isEmpty()){
            current = nodes.poll();
            if(current != null){
                if(current.left != null ){
                    nodes.add(current.left);
                }
                if(current.right != null){
                    nodes.add(current.right);
                }
                //swap children of current node
                TreeNode temp = current.right;
                current.right = current.left;
                current.left = temp;
            }

        }

        return root;
    }

}
