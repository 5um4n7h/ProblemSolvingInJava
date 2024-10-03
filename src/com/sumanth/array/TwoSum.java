package com.sumanth.array;

import java.util.Arrays;
//Blind 75
//https://leetcode.com/problems/two-sum/
//time complexity 2
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(var i=0;i<nums.length;i++)
        {
            for(var j=0;j<nums.length;j++){

                if(i!=j&&nums[i]+nums[j]==target){
                    arr[0] =i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }
}
