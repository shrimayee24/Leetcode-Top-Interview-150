//tell whether a number is palindrome or not
//palindrome-> when read from left to right or right to left remains unchanged 
//palindrome is a string having symmetry in characters
class Prob9
{
    public boolean isPalindrome(int x) 
    {
        String str=Integer.toString(x);
        char[] ch=str.toCharArray();
        
        //initialise pointers to first and last index
        int first=0,last=ch.length-1;

        //symmetrically check characters one by one
        
        while(first<last)
        //pointers shouldn't overlap each other
        {
            //if characters at symmetric positions from centre not equal, not palindrome
            //dont check further
            if(ch[first]!=ch[last])
            {
                return false;
            }
            
            //else check further by symmetrically bringing pointers closer to centre
            first++;
            last--;
            
        }

        return true;
    }
}
