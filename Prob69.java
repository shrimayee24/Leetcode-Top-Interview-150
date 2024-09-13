//return nearest square root of a +ve integer
class Prob69
{
    public int mySqrt(int x) 
    {
        //base case- sqrt of 0 = 0; sqrt of 1 =1
        if(x==0 || x==1)
        {
            return x;
        }

        //binary search-optimized way
        
        int left=1, right=x-1,mid=0,temp=0;
        //initialize pointers to extreme points of range
        
        while(left<=right)
        //pointers should not cross each other
        {
           mid=left+((right-left)/2);
           //find middle element of range
           //formula of mid to reduce overflow

           //mid*mid=x ; mid=x/mid to reduce time
           if(mid==x/mid)
           //if square of middle equals x return mid, dont check further
           {
             return mid;
           }
           
           if(mid>x/mid)
           //if square of middle element is greater than x, reduce range by checking all   elements less than middle element
           {
             right=mid-1;
           }
           else
           //if square is less than x
           {
             left=mid+1;
             //chek whether squares of greater elements<x
             temp=mid;
             //temporarily store mid value
             
           }
        }
        return temp;
        //if no greater elements found, return temporary value itself

    }
}
