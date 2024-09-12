//sum of 1+integer stored as array
//return sum as array
class Prob66
{
    public int[] plusOne(int[] digits) 
    {
        for(int n=digits.length-1; n>=0; n--)
        {
            if(digits[n]<9)
            //check whether last digit is less than 9
            {
                digits[n]++;
                //increment last digit by 1
                return digits;
                 //dont go further-return array
            }
            else
            //if any digit is 9
            {
                digits[n]=0;
                //put 0 at that pos
                //carry over of 1 is done in previous if condition
                //dont return array after putting 0, return after incrementing previous digit
            }
        }

        //array not returned i.e array contains all zeros.
        //which means original digit consisited of only 9s
        
        int[] newdigit=new int[digits.length+1];
        //if all 9s then new array will be of length greater by 1 
        //[9]-> [1,0] [9,9]->[1,0,0]

        newdigit[0]=1;
        return newdigit;
        //by default all indices contain 0, only place 1 at first position, return array
        
        
    }
}
