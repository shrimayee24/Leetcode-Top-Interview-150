//greedy approach
//calculate starting point from where subsequent indices are accumulating gas and not losing gas
//if gas lost first,can not complete round
class Prob134 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int sumgas=0,max=0,ans=-1,i=0;
        //traverse from last to first
        for(i=gas.length-1;i>=0;i--)
        {
            sumgas=sumgas+(gas[i]-cost[i]);
            //calculate how much gas lost or left at each traversal
            //max=previous sum value
            if(sumgas>=max)
            {
                //if gas accumulating take curr index as starting point
                ans=i;
               max=sumgas;
               
            }
        }
        //if all gas lost,return -1;
        if(sumgas<0)
        {
            return -1;
        }
        //else return starting point
        else
        {
            return ans;
        }
        
    }
}
