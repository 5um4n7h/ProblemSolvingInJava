package com.sumanth.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE {

    public static void main(String[] args) {
        NGE nge = new NGE();
        int[] result = nge.nextGreaterElement(new int[]{0,4,1,3}, new int[]{3,2,5});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Build the NGE map for nums2 in O(m)
        for (int num : nums2) {
            // Pop all smaller elements from stack
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);  // num is NGE for popped element
            }
            stack.push(num);
        }

        // Remaining elements in stack have no NGE
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build result for nums1 in O(n)
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
