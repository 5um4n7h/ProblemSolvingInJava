//https://codeforces.com/contest/1352/problem/A

package com.sumanth.basic;

import java.util.*;

public class SumOfRoundNumbers {
    public static void main (String[] args) {
        System.out.println("Number of inputs : ");
        var scanner = new Scanner(System.in);
        
        var n = scanner.nextInt();
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number : ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        var resultMap = new HashMap<Integer, List<Integer>>();
        var list = new ArrayList<Integer>();
        
        for (Integer num : numbers) {
            var l = num.toString().length() - 1;
            list = new ArrayList<>();
            while (l >= 0) {
                if (num.toString().charAt(l) != '0') {
                    int multiplier = (int) Math.pow(10, l);
                    int finalNumber = Integer.parseInt(String.valueOf(num.toString().charAt(num.toString().length() - l - 1))) * multiplier;
                    list.add(finalNumber);
                }
                l--;
            }
            resultMap.put(list.size(), list);
        }
        
        for (var item : resultMap.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
