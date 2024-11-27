//find whether following ransomnote can be constructed from magazine letters
class Prob383 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        //maintain indexwise count of letters in magazine  
        int letterCount[]=new int[26];
        for(char m:magazine.toCharArray())
        {
           //index of letter=ascii value of letter-ascii value of 'a'
           letterCount[m-'a']++;
        }
           //check with characters in ransomenote
           for(char r:ransomNote.toCharArray())
           {
               //if letter in ransomnote doesnt exist in magazine, return false
               if(letterCount[r-'a']==0)
               {
                   return false;
               }

               //if letter in ransomnote exists in magazine, use that letter, decrement   count in magazine
               else
               {
                  letterCount[r-'a']--;
               }
           }
        
        return true;
    }
}
