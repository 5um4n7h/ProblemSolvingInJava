package com.sumanth.leetcode;

import java.util.HashMap;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicateFromSortedArray3 {
    public static void main(String[] args) {

        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }

    public static int removeDuplicates(int[] nums) {

        var map = new HashMap<Integer, Integer>();
        for (var num : nums) {
            var existingCount = map.getOrDefault(num, 0);
            map.put(num, existingCount + 1);
        }

        var newNums = new int[nums.length];
        var cnt = 0;
        for (var i = 0; i < nums.length; i++) {
            var count = map.get(nums[i]);
            if (count <= 2) {
                newNums[cnt] = nums[i];
                cnt++;
            }
            if (count > 2) {
                map.put(nums[i], --count);
            }
        }

        nums = newNums;
        return cnt;


        //two pointer approach
//        int i = 0;
//        for (int n : nums) {
//            if (i < 2 || n != nums[i - 2]) {
//                nums[i++] = n;
//            }
//        }
//        return i;
    }
}
