package com.sumanth.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9, 11}));
    }

    public List<String> summaryRanges(int[] nums) {

        var start = 0;
        var end = 0;
        List<String> result = new ArrayList<>();
        while (end < nums.length) {

            if (start == end) {
                if (end == nums.length - 1) {
                    result.add(nums[start] + "");
                    return result;
                }
                if (nums[start] + 1 == nums[start + 1]) {
                    end++;
                } else {
                    result.add(nums[start] + "");
                    start++;
                    end++;
                }
            } else {
                if (nums[start] + (end - start) == nums[end]) {
                    end++;
                    if (end == nums.length) {
                        result.add(nums[start] + "->" + nums[end - 1]);
                        return result;
                    }
                } else {
                    result.add(nums[start] + "->" + nums[end - 1]);
                    start = end;

                }
            }
        }
        return result;
    }
}
