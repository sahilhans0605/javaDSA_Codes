package arraysBasicsClassFive;

public class StockBuyAndSell2 {
    public static void main(String[] args) {
//        0(N)
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit;
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            profit = prices[i + 1] - prices[i];
            if (prices[i + 1] > prices[i]) {
                maxProfit += profit;
            }
        }
        System.out.println(maxProfit);
    }
}
