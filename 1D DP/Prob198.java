//maximum money robbed from alternate houses
class Solution 
{
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int prev2 = 0; // Store the maximum sum up to two houses before
        int prev1 = 0; // Store the maximum sum up to the last house


        for (int num : nums) 
        {
            //temp points to previous prev1
            int temp = prev1;
            //prev1-max sum till now-either prev value or curr value+prev to prev value-take maximum
            prev1 = Math.max(prev2 + num, prev1);
            //update pointer to prev to prev value by temp
            prev2 = temp;
        }

//return maximum sum till end of array
        return prev1;
    }
}
