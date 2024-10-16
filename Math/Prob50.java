//power function
//binary exponentiation-recursively square number and divide power in half
//if odd number occured->multiply result from previous recursion with recursive results of numbers<odd number.
class Solution 
{
    public double myPow(double x, int n) 
    {
        // Handle special case when n is Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            return 1.0 / (myPow(x, -(n + 1)) * x); // Avoid overflow by handling n + 1
        }

        if (n == 0) return 1.0; // Base case
        if (n < 0) return 1.0 / myPow(x, -n); // For negative powers
        
        if (n % 2 == 0) 
        {
            return myPow(x * x, n / 2); // Even power
        } else {
            return x * myPow(x * x, (n - 1) / 2); // Odd power
        }
    }
}
