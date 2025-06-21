package com.sumanth.searching;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
    }

    private static int binarySearch(int[] ints, int i) {

        int low = 0;
        int high = ints.length - 1;

        while (low <= high) {
            var mid = low + (high - low) / 2; // To avoid overflow

            if (ints[mid] == i) {
                return mid; // Element found
            } else if (ints[mid] < i) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1;

    }
}
