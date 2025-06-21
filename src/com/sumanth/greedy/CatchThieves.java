package com.sumanth.greedy;

import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/police-and-thieves--141631
public class CatchThieves {
    public static void main(String[] args) {
        System.out.println(catchThieves(new char[]{'P', 'T', 'P', 'T', 'P'}, 1));
    }

    //    public static int catchThieves(char[] arr, int k) {
//        // code here
//        Queue<Integer> police = new LinkedList<>();
//        Queue<Integer> thief = new LinkedList<>();
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 'T') {
//                thief.add(i);
//            } else {
//                police.add(i);
//            }
//        }
//
//        int count = 0;
//        while (!police.isEmpty() && !thief.isEmpty()) {
//            int policeIndex = police.peek();
//            int thiefIndex = thief.peek();
//
//            if (Math.abs(policeIndex - thiefIndex) <= k) {
//                count++;
//                police.poll();
//                thief.poll();
//            } else if (policeIndex < thiefIndex) {
//                police.poll();
//            } else {
//                thief.poll();
//            }
//        }
//        return count;
//    }
    public static int catchThieves(char[] arr, int k) {

        int p = 0;
        int t = 1;

        int count = 0;
        while (p < arr.length && t < arr.length) {

            if(arr[p] == 'P' && arr[t] == 'P') {
                p++;
            } else if (arr[p] == 'T' && arr[t] == 'T') {
                t++;
            } else if (arr[p] == 'P' && arr[t] == 'T') {
                if (Math.abs(p - t) <= k) {
                    count++;
                    p++;
                    t++;
                } else {
                    t++;
                }
            } else if (arr[p] == 'T' && arr[t] == 'P') {
                if (Math.abs(p - t) <= k) {
                    count++;
                    p++;
                    t++;
                } else {
                    p++;
                }
            }

        }

        return count;

    }

}
