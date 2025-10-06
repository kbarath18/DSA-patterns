import java.util.*;

class maxProfit{
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};

		System.out.print(maxProfit(prices));
	}

	static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = -1;

        for(int i = 1;i<prices.length;i++){
        	if(buy > prices[i]){
        		buy = prices[i];
        	}else{
        		profit = Math.max(profit, (prices[i]-buy));
        	}
        }
        return profit;
    }
}