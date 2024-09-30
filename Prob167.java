//two sum for sorted array
class Prob167 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        //two pointers at extremea
        int left=0,right=numbers.length-1;
        int ans[]=new int[2];
      while(left<right)
      {
        //calculate sum of values at pointers
        int sum=numbers[left]+numbers[right];
        //if sum reaches target,add index positions increased by 1 to array
        if(sum==target)
        {
            ans[0]=left+1;
            ans[1]=right+1;
        }
        //if sum<target,try to increase sum
        //as all elements to right>left,increment left
        if(sum<target)
        {
            left++;
        }
        //if sum>target,try to decrease sum
        //as all elements to leftt>right,decrement right
        else
        {
            right--;
        }
      }
      return ans;
        
    }
}
