//check whether a number is happy or not
//use of recursion to split digits, dp to store previous result.

class Prob202 
{
    public boolean isHappy(int n) 
    {
        HashSet<Integer> visited=new HashSet<>();
        //hashset-to detect cycle in recursive sum of squares of digits
        //i.e to check whether curr result is matching with any previous result or not
        while(!visited.contains(n))
        //if result not repeated, add it hashset
        {
            visited.add(n);
            
            //calculate sum
            int sum=0;
            
            //split digits
            while(n!=0)
            {
              int digit=n%10;
              //split unit digit first e.g 1234->4
              sum+= digit*digit;
              //add to sum
              n=n/10;
              //split remaining digits left e.g 1234->123
              //recursively extract unit digit and remaining digits until all     digits are seperated
            }
           
            n=sum;
            //previous sum=input of next calculation
            //n updated for outer while loop
            
        }
        return n==1;
        //checks condition, returns true is condition satisfied
        //doesn't return value of n which is 1.
    }

    
}
