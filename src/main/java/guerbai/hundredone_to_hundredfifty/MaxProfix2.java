package guerbai.hundredone_to_hundredfifty;

public class MaxProfix2 {

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int begin = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                int thisProfit = prices[i-1] - prices[begin];
                maxProfit += thisProfit;
                begin = i;
            }
            if (i == prices.length-1) {
                if (prices[i] > prices[begin]) {
                    maxProfit += prices[i] - prices[begin];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }
}
