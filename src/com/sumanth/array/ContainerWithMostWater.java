package com.sumanth.array;


//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

    }

    public int maxArea(int[] height) {

        var max = height.length - 1;
        var maxArea = 0;

        //O(n*n)
        // for(var i=0;i<=max-1;i++){
        //    for(var j=i+1;j<=max;j++){
        //         var width = j-i;
        //         var min = Math.min(height[i],height[j]);

        //         var area = width*min;
        //         if(area>maxArea){

        //             maxArea = area;
        //         }


        // }

        //O(n)
        var i = 0;
        var j = max;

        while (i < j) {

            var width = j - i;
            var min = Math.min(height[i], height[j]);

            var area = width * min;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;

    }
}
