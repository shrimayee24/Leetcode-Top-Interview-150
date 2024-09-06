//check whether 2 nearby elements within range k are duplicate or not

class Prob219 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        //create hashmap to store key as data (for checking duplicate data as hashmap has unique keys) and value as indices
        Map<Integer,Integer> indices=new HashMap<>();
        for(int currindex=0; currindex<nums.length; currindex++)
        {
            
            
            if(indices.containsKey(nums[currindex]))
            {
                int pastindex=indices.get(nums[currindex]);
                //if element already ocurred before, retrieve its index (value in hashmap) 
                if(Math.abs(pastindex-currindex)<=k)
                //check whether currindex and pastindex are in range or not
                {
                    return true;
                }
                //if not in range, update index of data with currindex for further checking
                else
                {
                    indices.put(nums[currindex],currindex);
                }
                
            }
            //if element not occurred before, add element along with its index in hashmap
            else
            {
                indices.put(nums[currindex],currindex);
            }
        }
        return false;
    }
}
