//maximum subarray sum-Kadane's Algorithm 

//iterate through possible subarrays
//at any time if sum<0, dont extend array further- start a new subarray
//find maximum at each iteration

class Prob53
{
    public int maxSubArray(int[] nums) 
    {
        int maximum=Integer.MIN_VALUE,sum=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            //calculate sum at current iteration
            sum=sum+nums[i];
            
            //update maximum value at each sum calculation
            maximum=Math.max(maximum,sum);
            
            //before expanding array,check if sum>0 if not start a new subarray
            //i.e reset sum to 0 for next iteration
            if(sum<0) sum=0;
            
                
        }
        return maximum;
    }
}

