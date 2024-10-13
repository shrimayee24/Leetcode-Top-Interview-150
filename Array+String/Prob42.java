//calculate quantity of rainwater trapped
//bruteforce approach
class Prob42
{
    public int trap(int[] height) 
    {
        int totalwater=0;;
        for(int i=0;i<height.length;i++)
        {
            //find maximum height at left
            int maxleft=maxleft(i,height);
            
            //find maximum right at right
            int maxright=maxright(i,height);

            //find minimum of maximum heights found at left and right
            int minwater=Math.min(maxleft,maxright);
            
            //water stored on top of current bar would be minimum quantity that can be stored- space occupied by height of current bar
            int currwater=minwater-height[i];

            //if water can not be stored,dont add it to total quantity
            if(currwater>0)
            {
                totalwater+=currwater;
            }
            

        }
        return totalwater;
        
        
    }
    //find maximum height on left side of current bar
    public int maxleft(int index,int[] height)
    {
        int maxleft=0;
        //iterate through all bars previous to current bar
        for(int i=0;i<index;i++)
        {
            //find maximum height at each iteration
            maxleft=Math.max(maxleft,height[i]);
            //use this height to compare next element
        }
        return maxleft;
    }
     //find maximum height on right side of current bar
    public int maxright(int index,int[] height)
    {
        int maxright=0;
        //iterate through all bars previous to current bar
            for(int i=index+1;i<height.length;i++)
            {
                //find maximum height at each iteration
                maxright=Math.max(maxright,height[i]);
                //use this height to compare next element

            }
            return maxright;
    }

}
