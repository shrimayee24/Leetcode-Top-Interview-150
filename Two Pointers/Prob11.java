//maximum area of water in container
class Prob11 
{
    public int maxArea(int[] height) 
    {
      int maxarea=Integer.MIN_VALUE;
      //calculate boundaries of box by checking heights at extreme points
      //height of water=minimum height between the extreme heights
      //width=difference in line positions (height indices)

      //boundaries-two pointer approach
      int left=0,right=height.length-1;
      while(left<right)
      {
        int waterheight=Math.min(height[left],height[right]);
        int waterwidth=right-left;
        maxarea=Math.max(maxarea,waterheight*waterwidth);
        if(height[left]<height[right])
        {
            //check for other left heights less than right height
            left++;
        }
        //else check for other right heights
        else
        {
           right--;
        }
      }
      return maxarea;
    }
}
