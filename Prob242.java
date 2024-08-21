//chek whether strings are anagrams of each other

//logic similiar to ransom notes
//maintain array of count of letters
//increment count of letters by scanning string s.
//then scan string t and decrement count of letter found in t. i.e letter in s is used in t
//if all letters in s are ccoered in t then count at each index=0 
//i.e strings are anagrams of each other

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        //edge case-lengths of string dont match ,return false
    if(s.length()!=t.length())
    {
      return false;
    }
    else
    {
        int lettercount[]=new int[26];
        //add count of letters from string s 
        for(int i=0;i<s.length();i++)
        {
            lettercount[s.charAt(i)-'a']++;
        }

     //decrement count by scanning letters in string t
        for(int i=0;i<s.length();i++)
        {
            lettercount[t.charAt(i)-'a']--;
        }
        //check whether count is zero or not
        for(int i=0; i<lettercount.length; i++)
        {
            //if at any index count is not equal to zero, return false
            if(lettercount[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    }
}
