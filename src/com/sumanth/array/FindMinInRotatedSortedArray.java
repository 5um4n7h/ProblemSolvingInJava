package com.sumanth.array;

//leetcode blind 75
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(new FindMinInRotatedSortedArray().findMin(new int[]{3,4,5,1,2}));
    }
    public int findMin(int[] nums) {

        var left = 0;
        var right = nums.length-1;


        while(left<right){
            var mid = (left+right)/2;

            if(nums[mid]>nums[right]){

                left = mid+1;
            }else{

                right = mid;
            }


        }

        return nums[left];
    }
}
