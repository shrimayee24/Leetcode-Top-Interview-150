//moore voting algorithm
class Prob169 {
    public int majorityElement(int[] nums) 
    {
        int maj=0, count=0;
        for(int i=0; i<nums.length; i++)
        {
            //if count of previous iteration is 0, element of current iteration is winner
            if(count==0)
            {
                maj=nums[i];
            }
            //if count is not zero and current element=previous element,increase count by one
            if(maj==nums[i])//for next iteration
            {
              count++;
            }
            //if current element!=maj element, decrease count by one
            else
            {
               count--;
            }
        }
        return maj;
    }
}
