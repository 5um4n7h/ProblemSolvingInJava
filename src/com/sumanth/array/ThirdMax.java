package com.sumanth.array;

import java.util.Arrays;

//https://leetcode.com/problems/third-maximum-number/
public class ThirdMax {

    public static void main(String[] args) {
        System.out.println(new ThirdMax().thirdMax(new int[]{2, 2, 3, 1}));
    }
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }else{
            return nums[nums.length-3];
        }
    }
}
