//to return indices of 2 elements in array which add up to a specific number
//2 pointer approach

class Prob1
{
    public int[] twoSum(int[] nums, int target) 
    {
       int ans[]=new int[2];
       //create array for storing indices

       //take one element using i pointer sequentially in nums and keep checking sum for every succeeding elements in nums using j pointer
       for(int i=0; i<nums.length; i++)
       {
        for(int j=i+1; j<nums.length; j++)
        {
            if(nums[i]+nums[j]==target)
            //if condition satisfied, add indices i,j
            //dont check further
            {
                ans[0]=i;
                ans[1]=j;
                break;
            }
            
        }
       }
       return ans;    
    }
}
