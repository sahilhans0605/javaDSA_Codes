package arraysBasicsClassFive;

public class StockBuyAndSell1 {
    public static void main(String[] args) {
//        0(N)
        int prices[] = {2, 1, 4};
        int buyingPrice = Integer.MAX_VALUE;
        int profit;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyingPrice) {
                buyingPrice = prices[i];
            }
            profit = prices[i] - buyingPrice;
            if (maxProfit < profit) {//means profit > 0
                maxProfit = profit;
            }
        }
        System.out.print(maxProfit);
    }
}
