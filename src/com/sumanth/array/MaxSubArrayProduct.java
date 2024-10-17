package com.sumanth.array;

public class MaxSubArrayProduct {

    public int maxSubArray(int[] nums) {


        var cMin = nums[0];
        var cMax = nums[0];
        var max = nums[0];

        for(var i=1;i<nums.length;i++){
            var tempMax = cMax;

            cMax = Math.max(nums[i],Math.max(nums[i]*tempMax,nums[i]*cMin));
            cMin = Math.min(nums[i],Math.min(nums[i]*tempMax,nums[i]*cMin));
            max = Math.max(max,cMax);
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(new MaxSubArrayProduct().maxSubArray(new int[]{2,3,-2,4,-2}));
    }
}
