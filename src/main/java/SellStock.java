public class SellStock {
    public int maxProfit(int[] prices) {
            int maxProfit = 0;
         int  cheapestPrice = prices[0];
         for (int i = 0 ; i< prices.length;i++){
             if (prices[i] < cheapestPrice){
                 cheapestPrice = prices[i];

             }
             int currentPrice = prices[i]-cheapestPrice;
             maxProfit = Math.max(maxProfit,currentPrice);

         }
         return maxProfit;

    }
}
