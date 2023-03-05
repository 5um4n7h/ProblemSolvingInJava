//Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value.



package com.sumanth.array;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i =0;i<9;i++){
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
        int val = 9;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==val){
                    System.out.println(true);
                    return;
                }
            }
        }

    }
}
