//https://leetcode.com/problems/number-of-common-factors/

package com.sumanth.leetcode;

public class CommonFactors {
    // optimized, O(min(a,n)) time complexity
    public int commonFactors(int a, int b) {

        var count = 0;

        var min = Math.min(a, b);
        for (var i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }


        return count;
    }

    //brute force method
//    public int commonFactors(int a, int b) {
//
//        int max = Math.max(a, b);
//        int count = 0;
//        for (int i = 1; i <= max; i++) {
//
//
//            boolean flag1 = false;
//            boolean flag2 = false;
//            for (int k = 1; k <= max; k++) {
//                if (i * k == a)
//                    flag1 = true;
//                if (i * k == b)
//                    flag2 = true;
//
//
//            }
//            if (flag1 && flag2)
//                count++;
//
//
//        }
//        return count;
//    }

    public static void main(String[] args) {
        System.out.println(new CommonFactors().commonFactors(25, 30));
    }
}