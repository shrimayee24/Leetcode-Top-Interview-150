//find minimum in rotated sorted array
class Prob153
{
    public int findMin(int[] nums) 
    {
      //sort array in ascending order
        Arrays.sort(nums);
      //return first element which is the minimum value
        return nums[0];
    }
}
