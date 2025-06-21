package com.sumanth.leetcode;


public class LongestUnivaluePath {

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

    public int longestUnivaluePath(TreeNode root) {
        var value = root.val;
        var length = 1;
        return recursivecall(root,value,length);
    }

    private int recursivecall(TreeNode root,int value,int length){
        if(root.left==null||root.right==null){
            return length;
        }
        var leftValue = root.left.val;
        var rightValue = root.right.val;
        var newLength1 = 0;
        var newLength2 = 0;
        if(leftValue==value&&rightValue!=value){
            newLength1 = recursivecall(root.left,value,++length);
            return newLength1;
        }

        if(rightValue==value&&leftValue!=value){
            newLength2 = recursivecall(root.right,value,++length);
            return newLength2;
        }
        return Math.min(newLength1,newLength2);
    }

    public static void main(String[] args) {
        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        TreeNode root = longestUnivaluePath.new TreeNode(5);
        root.left = longestUnivaluePath.new TreeNode(4);
        root.right = longestUnivaluePath.new TreeNode(5);
        root.left.left = longestUnivaluePath.new TreeNode(1);
        root.left.right = longestUnivaluePath.new TreeNode(1);
        root.right.right = longestUnivaluePath.new TreeNode(5);

       // int result = longestUnivaluePath.longestUnivaluePath(root);
       // System.out.println("Longest Univalue Path: " + result); // Output: 2

        //[1,4,5,4,4,null,5]
        TreeNode root2 = longestUnivaluePath.new TreeNode(1);
        root2.left = longestUnivaluePath.new TreeNode(4);
        root2.right = longestUnivaluePath.new TreeNode(5);
        root2.left.left = longestUnivaluePath.new TreeNode(4);
        root2.left.right = longestUnivaluePath.new TreeNode(4);
        root2.right.right = longestUnivaluePath.new TreeNode(5);
        int result2 = longestUnivaluePath.longestUnivaluePath(root2);
        System.out.println("Longest Univalue Path: " + result2); // Output: 2
    }

}
