package com.sumanth.leetcode;

//https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
public class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{1, 1, 1, 1, 1}));
    }

    public static int jump(int[] nums) {



        var count = iterateRecursive(nums, 0, 0);


        return count;
    }

    private static int iterateRecursive(int[] nums, int count, int index) {
        if(index == nums.length) {
            return count;
        }

        var maxRange = index+nums[index];

        for(var i=index+1;i<=maxRange;i++){

           iterateRecursive(nums,++count,i);
        }
        return count;

    }


}
