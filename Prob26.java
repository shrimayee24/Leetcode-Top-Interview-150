//remove duplicate elements from sorted array
class Prob26
{
    public int removeDuplicates(int[] nums) 
    {
       int count=1;
	    
		for(int i=1;i<nums.length; i++)
		{
			//if previous element is not equal to next element, both are unique elements, increment counter
			if(nums[i]!=nums[i-1])
			{
				nums[count]=nums[i];
                count++;
			}
		}
		return count;
    }
}
