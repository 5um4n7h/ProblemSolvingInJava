package com.sumanth.array;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (var i = 0; i < 10; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
        //prints the memory reference
        System.out.println(arr);
        //delete at 5th

        for (int i = 4; i < 9; i++) {
            arr[i] = arr[i + 1];
        }
        arr[9] = 0;
        //arr[9]= null; not possible
        System.out.println(Arrays.toString(arr));

    }

}
