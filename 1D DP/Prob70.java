//return combination of steps for n steps
//fibonacci number problem
//dp- previous sum stored is used for calculation of next sum.

class Prob70 
{
    public int climbStairs(int n) 
    {
        //number of combinations remain same for n= 1,2 or 3 steps
        if(n<=3)
        {
            return n;
        }
       
       //for n greater than 3, number of combinations is the fibonacci number at nth      position of the fibonacci series for n steps.
        int a=0, b=1, steps=0;
        //first 2 nos to add in fib series are 0 ad 1
        for(int i=1; i<=n; i++)
        {
            steps=a+b;
            a=b;
             //move a ahead to b value
             
             b=steps;
            //move b ahead to sum value
           
        }
        return steps;
      
    }
}
