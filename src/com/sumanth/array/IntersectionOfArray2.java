package com.sumanth.array;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=problem-list-v2&envId=array
public class IntersectionOfArray2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new IntersectionOfArray2().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
    public int[] intersect(int[] nums1, int[] nums2) {

        var arrayList = new ArrayList<Integer>();

        var n1 = 0;
        var n2 = 0;

        while(n1<nums1.length&&n2<nums2.length){
            if(nums1[n1]==nums2[n2]){
                arrayList.add(nums1[n1]);
                n1++;
                n2++;
            } else{
                n2++;
                if(n2==nums2.length){
                    n1++;
                    n2=0;
                }
            }
        }

        int[] res = new int[arrayList.size()];
        for(var i=0;i<res.length;i++){
            res[i] = arrayList.get(i);
        }

        return res;
    }
}
