//add elements occuring not more than twice

//check for every alternate elements iteratively
//if element present more than twice, every alternate element in the set of occurrence is equal.
class Prob80
{
    public int removeDuplicates(int[] nums) 
    {
        //first and second element already added
        //at 0th and 1st index, same element can occur twice or 2 elements can occur once.
        int count=2;

//return count if array is of size<=2
        if(nums.length<=2)
        {
            return count;
        }
        
        //iteratively check for every alternate element starting from 2nd index
        //2nd compared to 0th, 3rd compared to 1st,and so on till we reach end of array.
        for(int i=2;i<nums.length; i++)
        {
            //if elements not equal, that means element occurs either once or twice only.
            //count-2 is used to compare elements in modified array.
            if(nums[i]!=nums[count-2])
            {
                
               //count variable is also an index pointer to place elements in valid sequence.
               nums[count]=nums[i];
               //increment count
               count++;

               
            }
        }
        return count;
    }
}
