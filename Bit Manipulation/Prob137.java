//find unique integer in array (which repeats only once)
//other elements appear thrice
class Prob137
{
    public int singleNumber(int[] nums) 
    {
        //initialise hashmap to store element as key and its count as value
       HashMap<Integer,Integer> hm=new HashMap<>();
       
       //add elements in hashmap
       for(int i=0;i<nums.length;i++)
       {
        //for duplicate element
        //if element already added, increment its count
         if(hm.containsKey(nums[i]))
         {
            int count=hm.get(nums[i]);
            count+=1;
            hm.put(nums[i],count);
         }
         //otherwise put element to hashmap and initial count=1
         else
         {
            hm.put(nums[i],1);
         }
       }

       //check if any element has count or key=1;
       //iterate through each key-value pair
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            //if particular entry has key=1,return the value of that entry i.e the unique  element
            if(entry.getValue().equals(1))
            {
                return entry.getKey();
            }
        }
        //element doesnt exist, return -1;
        return -1;
    }
}
