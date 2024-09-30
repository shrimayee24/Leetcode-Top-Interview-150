//3sum problem
class Prob15 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> triplets=new ArrayList<>();
        //sort array in ascending order
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            //if i is first element or value of i already checked before,skip
            if(i>0 && nums[i-1]==nums[i]) continue;

            //2nd element-next element from i
            int j=i+1;

            //3rd element-last element
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                //if sum is <0-increase sum,increment j as array is sorted
                if(sum<0)
                {
                    j++;
                }
                //if sum is >0-decrease sum,decrement k as array is sorted
                else if(sum>0)
                {
                    k--;
                }
                //if sum==0: append to list
                else
                {
                  triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                  
                  //increment j until unique element found
                  while(j<k && nums[j]==nums[j+1])
                  {
                      j++;
                  }
                  //decrement k until unique element found
                  while(j<k && nums[k]==nums[k-1])
                  {
                      k--;
                  }
                  j++;
                  k--;
                
                }
            }

        }
        return triplets;

        
    }
}
