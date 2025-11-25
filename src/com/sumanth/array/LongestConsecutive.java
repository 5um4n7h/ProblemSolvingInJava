package com.sumanth.array;

import java.util.Arrays;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutive {

    public static void main(String[] args) {
        System.out.println(new LongestConsecutive().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(new LongestConsecutive().longestConsecutive(new int[]{1,0,1,2}));
    }

    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        var len = nums.length;
        var i=0;
        var cnt = 1;
        var max = 0;
        while(i<len-1){

            if(nums[i]+1 ==nums[i+1]){
                cnt++;
                if(cnt>max){
                    max = cnt+1;
                }
            }else{
                cnt = 0;
            }
            i++;

        }
        return max;
    }
}
