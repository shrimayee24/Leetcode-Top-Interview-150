//check if can reach to last index through jumps

//jump from curr index=value at curr index
//greedy approach-check whether an reach from prev pos to goal pos
//bring goal to prev position-no need to check subsequent jumps
//focus on current jump only (local)
class Prob55 {
    public boolean canJump(int[] nums) 
    {
        //initialize goal position
        int goal=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            //next position (i+nums[i])=position at current index(i)+ no.of jumps(=value at curr index=nums[i])
            if(i+nums[i]>=goal)
            {
                goal=i;
            }
        }
        //if goal reaches start pos,that means it is possible to go from start to end
        return goal==0;
    }
}
