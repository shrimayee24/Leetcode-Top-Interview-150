//longest consecutive sequence
class Prob128 
{
    public int longestConsecutive(int[] nums) 
    {
        //if array is empty,return 0
        if(nums.length==0)
        {
            return 0;
        }
        
        //sort array in ascending order
        Arrays.sort(nums);
        
        int currcount=1,maxcount=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            //if duplicate elements found,go for next iteration
            if(nums[i]==nums[i-1]) continue;
            
            //if current element is consecutive of previous,increment count
            if(nums[i]==nums[i-1]+1)
            {
                currcount++;
            }
            
            //if consecutive sequence breaks,store maximum length of sequence encountered so far 
            //compare maximum length with next length of sequence
            else
            {
                maxcount=Math.max(maxcount,currcount);
                currcount=1;
            }
        }
        //Used Math.max(maxCount, count) to ensure the maximum sequence length is recorded even after the loop ends.
        //loop updates the maxCount only when it finds a break in the sequence (i.e., non-consecutive numbers). 
        //If the longest consecutive sequence continues until the last element, there won't be a break, so the maxCount won't get updated at the end of the loop.
        return Math.max(maxcount,currcount);
        
    }
}
