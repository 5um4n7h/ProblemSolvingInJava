package com.sumanth.array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/?envType=problem-list-v2&envId=array
public class PascalTriangle2 {
    public static void main(String[] args) {
        System.out.println(new PascalTriangle2().getRow(3));
    }

    //old school approach
//    public List<Integer> getRow(int rowIndex) {
//
//        List<Integer> ans = new ArrayList<>();
//        for(var i=0;i<=rowIndex;i++){
//            var columnIndex = ans.size();
//            var prevAns = new ArrayList<>(ans);
//            ans.add(1);
//            for(var j=1;j<columnIndex;j++){
//                var ele1 = prevAns.get(j-1);
//                var ele2 = prevAns.get(j);
//                //replace the element at j with sum of ele1 and ele2
//                ans.set(j,ele1+ele2);
//            }
//        }
//        return ans;
//    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);

        if (rowIndex == 0) {
            return row;
        }

        for (int rowNum = 1; rowNum <= rowIndex; rowNum++) {
            // Iterate backwards to avoid creating copy
            for (int col = rowNum - 1; col > 0; col--) {
                int sum = row.get(col) + row.get(col - 1);
                row.set(col, sum);
            }
            row.add(1);
        }

        return row;
    }

}
