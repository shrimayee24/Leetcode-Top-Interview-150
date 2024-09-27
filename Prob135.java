class Solution {
    public int candy(int[] ratings) 
    {
        int candies[]=new int[ratings.length];
        //initialize candies to 1-each child gets minimum 1 candy
        
        if(ratings.length==1)
        {
            return 1;
        }
        for(int i=0;i<candies.length;i++)
        {
            candies[i]=1;
        }
        //check for left neighbour-forward pass
        for(int i=1;i<candies.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
        }
        //check for right neighbour-backward pass
        for(int i=candies.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        //calculate total candies
        int totalcandy=0;
        for(int i=0;i<candies.length;i++)
        {
            totalcandy=totalcandy+candies[i];
        }
        return totalcandy;

        
    }
}
