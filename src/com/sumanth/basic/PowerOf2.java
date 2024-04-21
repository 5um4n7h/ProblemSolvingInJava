//https://leetcode.com/problems/power-of-two/description/
package com.sumanth.basic;

public class PowerOf2 {
    //time complexity O(1)
   // space complexity O(1)
    public boolean isPowerOfTwo(int n){
        return n>0 && (n &(n-1))==0;
    }

    /*
    time complexity O(n)
    space complexity O(1)
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        for(var i=1;i<n;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }

     */
    public static void main(String[] args) {
        System.out.println(new PowerOf2().isPowerOfTwo(3));
    }
}
