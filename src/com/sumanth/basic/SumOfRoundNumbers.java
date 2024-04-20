//https://codeforces.com/contest/1352/problem/A


package com.sumanth.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of inputs : ");
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            System.out.println("Enter the number : ");
            int n = scanner.nextInt(); // the number to represent

            List<Integer> roundNumbers = new ArrayList<>();
            int placeValue = 1; // to track place value (1, 10, 100, 1000, ...)

            while (n > 0) {
                int digit = n % 10;
                if (digit > 0) {
                    roundNumbers.add(digit * placeValue);
                }
                n /= 10;
                placeValue *= 10;
            }

            // Output result for this test case
            System.out.print(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(" " + num);
            }
            System.out.println();
        }

        scanner.close();
    }
}

