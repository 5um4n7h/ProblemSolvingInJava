//Given an integer array nums sorted in non-decreasing order,remove the duplicates in-place such that each unique element appears only once.The relative order of the elements should be kept the same.Then return the number of unique elements in nums.
//
//        Consider the number of unique elements of nums to be k,to get accepted,you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.The remaining elements of nums are not important as well as the size of nums.
//        Return k.
//        Custom Judge:
//
//        The judge will test your solution with the following code:
//
//        int[]nums=[...]; // Input array
//        int[]expectedNums=[...]; // The expected answer with correct length
//
//        int k=removeDuplicates(nums); // Calls your implementation
//
//        assert k==expectedNums.length;
//        for(int i=0;i<k;i++){
//        assert nums[i]==expectedNums[i];
//        }
//        If all assertions pass,then your solution will be accepted.
//
//
//        Example 1:
//
//        Input:nums=[1,1,2]
//        Output:2,nums=[1,2,_]
//        Explanation:Your function should return k=2,with the first two elements of nums being 1and 2respectively.
//        It does not matter what you leave beyond the returned k(hence they are underscores).
//
//

package com.sumanth.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {

        Set<Integer> intSet = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : nums) {
            if (intSet.add(num)) {
                uniqueList.add(num);
            }
        }
        // Copy the unique elements back to the original array
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }

        return uniqueList.size();

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};

        System.out.println(new RemoveDuplicatesFromArray().removeDuplicates(nums));
    }
}
