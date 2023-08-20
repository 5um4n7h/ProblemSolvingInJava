package com.sumanth.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("IX"));

    }


    int romanToInt(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(input.charAt(input.length() - 1));
        for (int i = input.length() - 2; i >= 0; i--) {
            if (map.get(input.charAt(i)) < map.get(input.charAt(i + 1))) {
                res -= map.get(input.charAt(i));
            } else {
                res += map.get(input.charAt(i));
            }
        }
        return res;
    }

}

