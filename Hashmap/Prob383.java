//find whether a given ransomnote can made from magazine letters or not

class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        //maintain indexwise count of letters in magazine  
        int letterCount[]=new int[26];
        for(char ch:magazine.toCharArray())
        {
           //index of letter=ascii value of letter-ascii value of 'a'
           letterCount[ch-'a']++;
        }
           //check with characters in ransomenote
           for(char ch:ransomNote.toCharArray())
           {
               //if letter in ransomnote doesnt exist in magazine, return false
               if(letterCount[ch-'a']==0)
               {
                   return false;
               }

               //if letter in ransomnote exists in magazine, use that letter, decrement   count in magazine
               else
               {
                  letterCount[ch-'a']--;
               }
           }
        
        return true;
    }
}
