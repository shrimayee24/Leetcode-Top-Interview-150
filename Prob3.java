//find longest substring without repeating characters
class Prob3
{
    public int lengthOfLongestSubstring(String s) 
    {
        //set to check duplicate elements
        HashSet<Character> check=new HashSet<>();
        int left=0,windowsize=Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++)
        {
            //if duplicate element found within window boundary
            while(check.contains(s.charAt(right)))
            {
                //update left window boundary by removing element value at boundary from set
              check.remove(s.charAt(left));
              //shift boundary by one
              left++;
            }
            //if unique element found,add it to set
            check.add(s.charAt(right));
            //calculate current windowsize
            int currsize=right-left+1;
            //update windowsize for next iteration
            windowsize=Math.max(currsize,windowsize);

        }
        //if windowsize not changed, no valid substring found 
        if(windowsize==Integer.MIN_VALUE)
        {
            return 0;
        }
        return windowsize;
        
    }
}
