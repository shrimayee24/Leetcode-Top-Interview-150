//find best time to buy and sell stock and calculate total profit
//greedy approach
class Prob122 {
    public int maxProfit(int[] prices) 
    {
      int totalprofit=0;

      //i initialised to 1 to check values of previous index for every iteration
      for(int i=1;i<prices.length;i++)
      {
        //check whether price of current day>price of previous day
        //only then add profit value
         if(prices[i]>prices[i-1])
         {
            totalprofit+=prices[i]-prices[i-1];
            //add value difference(profit) to total profit
         }
      }
      return totalprofit;  
    }
}
