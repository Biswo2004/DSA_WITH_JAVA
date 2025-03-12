public class Best_Time__To_Buy_And_Sell_Stock {
    // Function to find the maximum profit
    static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate the profit and update the maximum profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example array of stock prices
        int profit = maxProfit(prices);
        System.out.println("Maximum profit is: " + profit);
    }
}

