//first and last position of element in sorted array
class Prob34 
{
    public int[] searchRange(int[] nums, int target) 
    {
        //store all indices of target element in a list
        List<Integer> list = new ArrayList<>();
        
        //add indices
        for (int i = 0; i < nums.length; i++) 
        {
            //skip elements<target
            if (nums[i] < target) continue;
            //iterate only till target elements and not after that
            //bcoz rest of elements will be >target only
            else if (nums[i] > target) break;
            //if target found,add index of target in list
            else list.add(i);
        }
        
        // If no elements were added, target not found,return [-1, -1]
        if (list.size() == 0) 
        {
            return new int[] {-1, -1};
        }
       
       //create array to store first and last index only of target
        int[] arr = new int[2];
        arr[0] = list.get(0); // first occurrence
        arr[1] = list.get(list.size() - 1); // last occurrence

        return arr;
    }
}
