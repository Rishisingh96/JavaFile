package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.ArrayList;
import java.util.Arrays;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

       Arrays.sort(coins, (a, b) -> b - a); // Sort in descending order
      //  Arrays.sort(coins, (a, b) -> a - b); // Sort in ascending order

      for(Integer coin : coins) {
            System.out.print(coin + " ");
        }
        System.out.println();

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <coins.length; i++) {
            if(coins[i] <= amount){
                while (coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("Total number of coins: " + countOfCoins);
        for (int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}
