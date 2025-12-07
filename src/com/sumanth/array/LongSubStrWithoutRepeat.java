package com.sumanth.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongSubStrWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(new LongSubStrWithoutRepeat().lengthOfLongestSubstring("aabaab!bb"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        List<Character> charList = new ArrayList<>();
        int max = 0;

        for (int pointer = 0; pointer < s.length(); pointer++) {
            char c = s.charAt(pointer);
            if (charList.contains(c)) {
                var index = charList.indexOf(c);
                charList.subList(0, index + 1).clear();
            } else {
                charList.add(c);
                max = Math.max(max, charList.size());
            }

        }
        return max;
    }

//    public int lengthOfLongestSubstringUnicode(String s) {
//        if (s == null || s.isEmpty()) return 0;
//        Map<Character, Integer> lastIndex = new HashMap<>();
//        int maxLen = 0;
//        int left = 0;
//        for (int right = 0; right < s.length(); right++) {
//            char c = s.charAt(right);
//            if (lastIndex.containsKey(c)) {
//                int prev = lastIndex.get(c);
//                left = prev + 1;
//            }
//            lastIndex.clear();
//            lastIndex.put(c, right);
//            maxLen = Math.max(maxLen, right - left + 1);
//        }
//        return maxLen;
//    }

}
