//best time to buy and sell stock

class Prob121 {
    public int maxProfit(int[] prices) 
    {
        //two pointer approach
        int l=0,r=0,profit=0,currprofit=0;
        while(r<prices.length)
        {
            //if buy>sell, move pinters by one index
            //place left at right(next position), move right by one
            if(prices[l]>prices[r])
            {
              l=r;
              r++;
            }
            //if sell>buy
            else
            {
                currprofit=prices[r]-prices[l];
                profit=Math.max(profit, currprofit);
                r++;
            }
        }
        return profit;

    }
}
