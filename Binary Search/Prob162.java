//find peak element
class Prob162 
{
    public int findPeakElement(int[] nums) 
    {
        int peak=0;
        if(nums.length==1)
        {
            return 0;
        }
        //check peak for extremes
        
        //check peak at beginning
        if (nums[0] > nums[1]) 
        {
            return 0;
        }
        // Check peak at last
        if (nums[nums.length - 1] > nums[nums.length - 2]) 
        {
            return nums.length - 1;
        }
        //check peak in middle of array
        for(int i=1;i<nums.length-1;i++)
        {
           if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
           {
             peak=i;
           }
        }
        return peak;
        
    }
}
