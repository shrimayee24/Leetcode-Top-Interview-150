//count number of trailing zeros in factorial of a number
//iteratively divide number by 5 till we get 1
//number of trailing zeros=addition of all quotients of each iteration
class Solution 
{
    public int trailingZeroes(int n) 
    {
        int count = 0;
        
        //iteratively divide by 5
        while (n >= 5) 
        {
            //divide number by 5
            n /= 5;
            //add quotient to sum
            count += n;
            //pass quotient for next iteration
        }
        
        return count;
    }
}
