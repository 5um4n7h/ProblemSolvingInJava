package com.sumanth.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    //n^2 time complexity
//    public int[] productExceptSelf(int[] nums) {
//        var length = nums.length;
//        int[] answer = new int[length];
//
//        for(var i=0;i<length;i++){
//            var value = 1;
//            for(var j=0;j<length;j++){
//                if(i!=j){
//                    value = value*nums[j];
//                }
//            }
//            answer[i] = value;
//        }
//        return answer;
//    }
    public int[] productExceptSelf(int[] nums) {

        var length = nums.length;
        int[] answer = new int[length];
        //rightmost number
        var right = nums[length-1];
        //leftmost number
        var left = nums[0];

        //init fist element to 1 since we are starting from left
        answer[0] = 1;
        for(var i=1;i<length;i++){
            answer[i] = left;
            left = left*nums[i];
        }

        for(int i = length-2;i>=0;i--){
            answer[i] = answer[i]*right;
            right = right*nums[i];
        }
        return answer;
    }
}


