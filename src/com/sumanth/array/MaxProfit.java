package com.sumanth.array;

//blind 75
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {
// time complexity 0(n^2)
// space complexity 0(n^2)
//    public int maxProfit(int[] prices) {
//        if(prices.length<2){
//            return 0;
//        }
//        var list = new ArrayList<Integer>();
//        for(var i=0;i<prices.length;i++){
//
//            for(var j=i+1;j<prices.length;j++){
//
//                list.add(prices[j]-prices[i]);
//            }
//        }
//        var max = Collections.max(list);
//        if(max>0){
//
//            return max;
//        }else
//            return 0;
//    }


// time complexity 0(n)
// space complexity 0(n)
public int maxProfit(int[] prices) {

    if (prices.length < 2) {
        return 0;
    }

    var minPrice = prices[0];
    var maxProfit = 0;


    for(var i=1;i<prices.length;i++){

        if(prices[i]<minPrice){
            minPrice = prices[i];
        }

        var profit = prices[i]-minPrice;
        if(profit>maxProfit){
            maxProfit = profit;
        }

    }

    return maxProfit;

}
    public static void main(String[] args) {
        var res = new MaxProfit().maxProfit(new int[]{3,2,1,2,3,4,5,6});
        System.out.println(res);
    }
}
