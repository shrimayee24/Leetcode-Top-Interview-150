//find length of last word in a string

class Prob58 {
    public int lengthOfLastWord(String s) 
    {
        //remove whitespaces at beginning of first string and end of last string
        String str=s.trim();
        int count=0;

        //iterate from last string, increment count
        //if whitespace occurs, break loop
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i)==' ')
            {
                break;
            }
            else
            {
                count++;
            }
        }  
        return count;      
    }
}
