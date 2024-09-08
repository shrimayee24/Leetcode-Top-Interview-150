//to search a given element in an array
//if element not found, insert element at correct position of ascending order.

class Prob35
{
    public int searchInsert(int[] nums, int target) 
    {
       for(int i=0; i<nums.length; i++)
       {
         //if target found, return index, dont check further
          if(nums[i]==target)
          {
            return i;
          }
          
          //if target number is less than curr number, we would have to shift currnumber by 1 and place target at the position of currnumber.
          //we would have to return index of currnumber which is i
          if(nums[i]>target)
          {
            return i;
          }
        }
        
        //if target is greater than currnumber, there must be some number ahead which is greater than target
          //if no number ahead left which is >target then target is greatest of all elements, placed at the index next to last index=length of array.
          return nums.length;
       
    }
}
