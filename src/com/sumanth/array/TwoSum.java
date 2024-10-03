package com.sumanth.array;

import java.util.Arrays;
//Blind 75
//https://leetcode.com/problems/two-sum/
//time complexity O(n^2)
public class TwoSum {
    //time complexity O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
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

    // time complexity O(n)
//    public static int[] twoSum(int[] nums, int target) {
//        var map = new HashMap<Integer,Integer>();
//
//        for(var i=0;i<nums.length;i++){
//            var comp = target - nums[i];
//            if(map.containsKey(comp)){
//                return new  int[]{i,map.get(comp)};
//
//            }
//            map.put(nums[i],i);
//        }
//
//        return new  int[]{0,0};
//    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }
}
