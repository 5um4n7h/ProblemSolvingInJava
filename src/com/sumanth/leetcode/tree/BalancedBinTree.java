//package com.sumanth.leetcode.tree;
//
//public class BalancedBinTree {
//    public static void main(String[] args) {
//
//       // level order [3,9,20,null,null,15,7]
//        BalancedBinTree balancedBinTree = new BalancedBinTree();
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//
//        int result = balancedBinTree.isBalanced(root,0);
//        System.out.println(result); // Expected output: true
//
//    }
//
//
//    public boolean isBalanced(TreeNode root,int depth) {
//
//        if (root == null) {
//            return true; // An empty tree is balanced
//        }
//        var leftDepth = isBalanced(root.left, depth + 1);
//        var rightDepth = isBalanced(root.right, depth + 1);
//
//        if(Math.abs(leftDepth - rightDepth) > 1) {
//            return false;
//        }
//
//
//        return true;
//    }
//}
