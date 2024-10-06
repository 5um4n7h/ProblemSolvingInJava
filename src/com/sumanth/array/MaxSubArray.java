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
        var size = nums.length;
        if(size==1)
            return nums[0];
        var list = new ArrayList<Integer>();
        for(var i=0;i<size;i++){
            var sum = 0;
            for(var j=i;j<size;j++){
                sum = sum+ nums[j];
                list.add(sum);

            }
        }

        var max = Collections.max(list);
        return max;

    }
    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{1,1,2,-1,3,-3}));
    }
}
