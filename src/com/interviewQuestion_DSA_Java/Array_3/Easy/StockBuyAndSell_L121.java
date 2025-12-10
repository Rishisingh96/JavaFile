package com.interviewQuestion_DSA_Java.Array_3.Easy;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class StockBuyAndSell_L121 {
    public static int MaxProfit(int price[]){
        int maxProfit = 0, bestBuy = price[0];

        for(int i=1; i<price.length; i++){
            if(price[i]>bestBuy){
                maxProfit = max(maxProfit, price[i] - bestBuy);
            }
            bestBuy = min(bestBuy, price[i]);
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int price[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(STR."Max Sell : \{ MaxProfit(price)}");
    }
}
