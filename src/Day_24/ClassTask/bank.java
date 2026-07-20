package Day_24.ClassTask;

public class bank {
    public static void main(String [] args){
        int [] prices = {1, 2, 3, 4, 5};
        int profit;
        int maxProfit=0;
        int n = prices.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                profit = prices[j] - prices[i];
                if(maxProfit > profit){
                    maxProfit = profit;
                }
            }
        }
    }
}
