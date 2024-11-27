//count number of trailing zeros
//iteratively divide number by 5 till we get 1
//number of trailing zeros=addition of all quotients of each iteration
class Solution 
{
    public int trailingZeroes(int n) 
    {
        //if number is less than 5, cannot be divided by 5
        if(n<5) return 0;
        
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
