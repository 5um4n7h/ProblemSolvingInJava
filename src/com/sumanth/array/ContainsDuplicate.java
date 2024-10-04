package com.sumanth.array;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    //O(n)
//    public boolean containsDuplicate(int[] nums) {
//        var hashset = new HashSet<Integer>();
//        for(var i=0;i<nums.length;i++){
//            hashset.add(nums[i]);
//        }
//        var sizeOfHashset = hashset.size();
//        var numSize = nums.length;
//
//
//        if(sizeOfHashset==numSize){
//            return false;
//        }else
//            return true;
//    }

    //optimized
    public boolean containsDuplicate(int[] nums) {
        var hashset = new HashSet<Integer>();
        for (int num : nums) {
            if (hashset.contains(num)) {
                return true;
            }
            hashset.add(num);
        }

            return false;
    }

}
