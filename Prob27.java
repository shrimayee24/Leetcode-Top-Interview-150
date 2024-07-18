class Prob27  {
    public int removeElement(int[] nums, int val) 
    {
        int count=0, i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
