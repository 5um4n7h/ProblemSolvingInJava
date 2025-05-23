package com.sumanth.array;

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid element with the rightmost element
            if (nums[mid] > nums[right]) {
                // Minimum is in the right part
                left = mid + 1;
            } else {
                // Minimum is in the left part, including mid
                right = mid;
            }
        }

        // At the end of loop, left == right, pointing to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(new MinInRotatedArray().findMin(new int[]{3,4,5,1,2}));
    }
}
