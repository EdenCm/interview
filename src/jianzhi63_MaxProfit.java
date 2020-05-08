public class jianzhi63_MaxProfit {
    /**
     * 假设某股票的价格按照时间先后顺序存储在数组中，问买卖该股票一次可能获得的最大利润是多少？
     * 如一支股票在某段时间内的价格为{9, 11, 8, 5, 7, 12, 16, 14}那么能在价格为5的时候购入并在价格为16时卖出，能获得最大利润11
     */
    class Solution {
        public int maxProfit(int[] prices) {
            // 判空
            if(prices == null || prices.length < 2) return 0;
            int min = prices[0]; // 用于存放数组中最小的值
            int max_profit = 0;//  存放当前最大利润

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) min = prices[i];
                int profit = prices[i] - min;
                if (profit > max_profit) max_profit = profit;
            }
            return max_profit;
        }
    }
}
