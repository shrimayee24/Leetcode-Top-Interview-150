//give consecutive numbers in integer array as a summarized range 

import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public List<String> summaryRanges(int[] nums) 
  {
        List<String> range = new ArrayList<>();
        
        if (nums.length == 0) 
        {
            return range;
        }
        //if empty input, return empty list
        
        int start = nums[0];
        //start of range begins at first index(index 0)
        
        for (int i = 0; i < nums.length; i++) 
        {
            
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1])
            //if i pointer has reached last element or range is breaking 
            {
                if (start == nums[i]) 
                //if current range has single element
                {
                    range.add(String.valueOf(start)); // Single element range
                }
                 else 
                 {
                    range.add(start + "->" + nums[i]); 
                    //add range from start till i where range isnt breaking
                }
                if (i != nums.length - 1) 
                //if not yet reached last element, start will be for immediate next i     which was breaking preceding range
                {
                    start = nums[i + 1];
                }
            }
        }
        
        return range;
    }
}
