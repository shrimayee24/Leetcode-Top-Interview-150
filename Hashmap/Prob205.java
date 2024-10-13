//check whether two strings are isomorphic or not

import java.util.HashMap;
class Prob205
{
    
    public boolean isIsomorphic(String s, String t) 
    {
        if (s.length() != t.length()) 
        {
            return false;
            // Strings of different lengths can't be isomorphic
        }  
        
        //create two hashmaps for checking two way mapping
        HashMap<Character, Character> hm = new HashMap<>(); //to check s->t mapping
        HashMap<Character, Character> reverseMap = new HashMap<>(); //to check t->s mapping
       
        for (int i = 0; i < s.length(); i++) 
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            
            if (hm.containsKey(sChar)) 
            // Check if sChar is already mapped to tChar
            {
                if (hm.get(sChar) != tChar) 
                //if current character is t string is mapped to other char also
                //i.e if tChar is mapped to 2 different chars in s string
                {
                    return false;  
                }
            } 
            //also check for reverse mapping
            else 
            {
                
                // Check if tChar is already mapped to another sChar
                if (reverseMap.containsKey(tChar)) {
                    if (reverseMap.get(tChar) != sChar) 
                    //if current character in s string is mapped to other char also
                //i.e if sChar is mapped to 2 different chars in t string
                    {
                        return false;  // If tChar is already mapped to another sChar
                    }
                }
                //if no mapping done before, add mapping in both directions
                hm.put(sChar, tChar);
                reverseMap.put(tChar, sChar);
            }
        }
        return true;
    }
}
