//https://leetcode.com/problems/add-digits/

package com.sumanth.leetcode;

public class SumDigitsUntilSingleDigit {
    public int addDigits (int num) {
        
        int sum = 0;
        
        while (sum == 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
        }
        
        return sum;
    }
    public int addDigitsOptimized (int num) {
        
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
    
    public static void main (String[] args) {
        System.out.println(new SumDigitsUntilSingleDigit().addDigits(22));
    }
}
