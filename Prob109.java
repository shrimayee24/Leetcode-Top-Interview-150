//minimum size subarray sum
class Prob109
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left=0,currsum=0,right=0,windowsize=Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++)
        {
            //initialize current sum to value at right pos(0th index)
            currsum+=nums[right];
            //if current sum reaches condition
            while(currsum>=target)
            {
                //calculate current windowsize
                int currsize=right-left+1;
                //update previous windowsize for next iteration
                windowsize=Math.min(windowsize,currsize);
                //shrink window by moving left pointer and updating sum
                currsum-=nums[left];
                left++;
            }
        }
        //if windowsize not changed,no valid subarray found
        if(windowsize==Integer.MAX_VALUE)
        {
            return 0;
        }
        return windowsize;
        
        
}
}
