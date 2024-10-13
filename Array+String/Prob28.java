//check if a string is a substring of another string

class Prob28 
{
    public int strStr(String haystack, String needle) 
    {
     
     
       //first char of substring will exist in big string maximum at a position of diffrenece between lengths of bigstring and substring
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
           //if first char exists, check subsequent characters
            if(haystack.charAt(i)==needle.charAt(0))
            {
              //check substring of bigstring starting at position of character of bigstring matched with first char of substring
              //iterate till length of substring from that particular index, excluding next character at position needle.length+i
                if(haystack.substring(i,needle.length()+i).equals(needle))
                {
                    return i;
                }
            }
            
        }
        return -1;
    }
}
