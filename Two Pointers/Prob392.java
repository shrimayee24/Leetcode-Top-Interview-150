//find whether a string is subsequence of another string

class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        //null string
        if(s.length()==0)
        {
            return true;
        }
        int i=0,j=0;

    
        while(i<s.length() && j<t.length())
        {
            //if character matches, check for next character
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }

            //if character of s doesnt match with character of t, check with subsequent indices of t
            else
            {
               
                j++;
            }
            

        }
        //if all letters in s match with t, return true
        if(i==s.length())
            {
                return true;
            }
            //else return false
            return false;
    }
}
