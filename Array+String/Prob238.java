// return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

/*Given `nums = [a, b, c, d]`
Then answer or the resulting list would be `[b*c*d, a*c*d, a*b*d, a*b*c]`
The left_pass, after left to right iteration gives `[1, a, a*b, a*b*c]`
The right_pass, after right to left iteration gives `[b*c*d, c*d, d, 1]`
Product of left_pass[i] and right_pass[i] would give us the above result.*/

class Prob238
{
    public int[] productExceptSelf(int[] nums) 
    {
        int left[]=new int[nums.length];
        
        //initialise first element of left=1;
        left[0]=1;
        
        int right[]=new int[nums.length];
        
        //initialise last element of right=1
        right[nums.length-1]=1;
        
        int ans[]=new int[nums.length];
        int leftproduct=1,rightproduct=1;
        
        //left pass-iterate from left to right,place cumulative products starting from second index
        for(int i=1;i<nums.length;i++)
        {
            //as we are 1 index ahead moving from left to right, we have to place elements 1 index behind  i.e 1 index to left
          leftproduct=leftproduct*nums[i-1];
          left[i]=leftproduct;
        }
        //right pass-iterate from right to left,place cumulative products starting from second last index
        for(int i=nums.length-2;i>=0;i--)
        {
            //as we are 1 index ahead moving from right to left, we have to place elements 1 index behind  i.e 1 index to right
          rightproduct=rightproduct*nums[i+1];
          right[i]=rightproduct;
        }
        //multiply element of left and right array which are at same position (index)
        //store product in ans array at same index
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=left[i]*right[i];
        }
     return ans;
    }
}
