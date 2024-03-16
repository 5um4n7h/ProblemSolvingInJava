package com.sumanth.leetcode;

public class ClimbStairs {
    
    public static void main (String[] args) {
        System.out.println(climbStairs(3));
    }
    
    public static int climbStairs (int n) {
        // Base case: if the target sum is 0, there is one way (empty combination)
        if ( n==1 ) {
            return 1;
        }
        
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 2;
        
        for (int i = 3; i <= n; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        
        return count[n];
    }
}
