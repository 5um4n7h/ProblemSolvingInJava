package com.sumanth.array;

public class PeakElement {

    public static void main(String[] args) {
        System.out.println(new PeakElement().findPeakElement(new int[]{1,2}));
    }
    public int findPeakElement(int[] nums) {

        for(var i=0;i<nums.length;i++){
            int left;
            int right;
            if(i-1==-1){
                left = nums[i]-1;
                right = nums[i+1];
            }else if(i+1==nums.length){
                right = nums[i]+1;
                left =  nums[i-1];
            }else{
                left = nums[i-1];
                right = nums[i+1];
            }
            if(nums[i]>left&&nums[i]>right){
                return i;
            }
        }
        return 0;
    }
}
