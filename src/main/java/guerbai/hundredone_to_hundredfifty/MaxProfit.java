package guerbai.hundredone_to_hundredfifty;

public class MaxProfit {

    private static int maxProfit(int[] prices) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i=1; i<prices.length; i++) {
            maxEndingHere = Math.max(0, maxEndingHere+prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
