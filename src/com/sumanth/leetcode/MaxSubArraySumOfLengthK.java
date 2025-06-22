package com.sumanth.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
public class MaxSubArraySumOfLengthK {

    public static void main(String[] args) {
        System.out.println(new MaxSubArraySumOfLengthK().maximumSubarraySum(new int[]{9,9,9,1,2,3}, 3));
    }

    public long maximumSubarraySum(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        int start = 0;
        long maxSum = 0;
        long sum = 0;

        for (int end = 0; end < nums.length; end++) {
            set.add(nums[end]);
            sum += nums[end];

            if (end - start + 1 == k) {
                // Check if the current window has all distinct elements
                if (set.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }

                // Slide the window
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }

        }


        return maxSum;

    }
}
