import java.util.*;
public class Stock_sell {
    public static int buyAndSellStock(int price[]){
        int buyPrice  = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < price.length;i++){
            if(buyPrice < price[i]){ //profit
                int profit = price[i]- buyPrice; // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
        public static void main(String[] args){
                int price[] ={ 7,1,5,3,6,4}; // time complexity - O(n) 
                System.out.println(buyAndSellStock(price));
        }
}
