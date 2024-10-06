package com.sumanth.array;

import java.util.ArrayList;
import java.util.Collections;
//LEETCODE   blind 75
//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {

    //0(n^2)
//    public int maxSubArray(int[] nums) {
//        var size = nums.length;
//        if(size==1)
//            return nums[0];
//        var list = new ArrayList<Integer>();
//        for(var i=0;i<size;i++){
//            var sum = 0;
//            for(var j=i;j<size;j++){
//                sum = sum+ nums[j];
//                list.add(sum);
//
//            }
//        }
//
//        var max = Collections.max(list);
//        return max;

//    }

    //0(n)
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize the maximum sum with the first element
        int currentSum = nums[0]; // Track the current sum

        for (int i = 1; i < nums.length; i++) {
            // Update the current sum by including the current number or starting fresh from it
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }
    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{1,1,2,-1,3,-3}));
    }
}
