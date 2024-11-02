//almost same as problem 26
//remove element mentioned in an integer array
class Prob27  {
    public int removeElement(int[] nums, int val) 
    {
        int count=0, i=0;
        for(i=0;i<nums.length;i++)
        {
            //if element to be removed exists, dont increment counter at that index iteration
            if(nums[i]!=val)
            {
                //count-placeholder to swap elements in place
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
