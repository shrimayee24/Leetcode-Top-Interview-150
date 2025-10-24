//Dynamic Programming (prefix-max & suffix-max arrays) approach
class Prob42 
{
    public int trap(int[] height) 
    {
        int len=height.length;
        //find max heights of bars on both sides

        //array to calculate max height on the left of each bar 
     //start from left side
        //traverse left to right, update max height on each iteration
        int left[]=new int[len];

        //initialize leftmost index to leftmost bar
left[0]=height[0];
        for(int i=1;i<len;i++)
        {
            //update index to the max of the current height (height[i]) and the height calculated till now (left[i-1])
            left[i]=Math.max(height[i],left[i-1]);
        }

//array to calculate max height on the right of each bar 
     //start from right side
        //traverse right to left, update max height on each iteration
        int right[]=new int[len];

        //initialize rightmost index to rightmost bar
right[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--)
        {
            //update index to the max of the current height (height[i]) and the height calculated till now (left[i-1])
            right[i]=Math.max(height[i],right[i+1]);
        }

        //calculate water amount between each 2 bars
        int amount=0;
        for(int i=0;i<len;i++)
        {
            //take min of heights of max heights of bars at left and right w.r.t current bar
            //amount=min-curr height
            amount+=Math.min(left[i],right[i])-height[i];

        }
return amount;
    }
}
