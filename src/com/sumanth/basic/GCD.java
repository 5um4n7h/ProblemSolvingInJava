
//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

package com.sumanth.basic;

public class GCD {

//    time complexity = O(log(min(a,b)))
//    space complexity = O(log(min(a,b)))

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    /* time complexity = O(min(a,b))
      space complexity = O(1)

    public int gcd(int a, int b) {
        // code here
        int ans = 0;
        for(var i=Math.min(a,b);i>0;i--){
            if (a % i == 0 && b % i == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }

     */

    public static void main(String[] args) {
        System.out.println(new GCD().gcd(3,6));
    }

}
