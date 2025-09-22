package com.sumanth.leetcode;

//https://leetcode.com/problems/longest-palindromic-substring/description/

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("babad"));
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("a"));
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("bb"));
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("ac"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        if(s.length()==1){
            return s;
        }

        var input = s.toCharArray();
        var maxPalindrome = "";
        for(var i=0;i<input.length;i++){
            for(var j=i;j<input.length;j++){
                var subString = s.substring(i, j +1);
                var isPalindrome = checkPalindrome(subString);
                if(isPalindrome){
                    var size = subString.length();
                    if(size>maxPalindrome.length()){
                        maxPalindrome = subString;
                    }
                }
            }
        }

        return maxPalindrome;
    }

    private Boolean checkPalindrome(String subString) {
        var left = 0;
        var right = subString.length() - 1;

        while (left < right) {
            if (subString.charAt(left) != subString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
