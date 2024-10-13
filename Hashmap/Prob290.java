//check whether a string is following a particular pattern or not

//logic is same as that of isomorphic strings
//only mapping of string to char
//breaking of string into individual words by using split function and whitespaces as delimiter (indicator) of word splitting.

import java.util.HashMap;
class Prob290 
{
    public boolean wordPattern(String pattern, String s) 
    {
        // Split the string s into words using whitespace as a delimiter
        String[] words = s.split("\\s+");

        // Check if the number of words matches the number of characters in the pattern
        if (words.length != pattern.length()) 
        {
            return false;
        }

        // Create two hashmaps for checking bidirectional mapping
        HashMap<Character, String> charToWordMap = new HashMap<>(); // to check pattern->word mapping
        HashMap<String, Character> wordToCharMap = new HashMap<>(); // to check word->pattern mapping

        for (int i = 0; i < pattern.length(); i++) 
        {
            char patternChar = pattern.charAt(i);
            String word = words[i];

            // Check pattern->word mapping
            if (charToWordMap.containsKey(patternChar)) 
            
            {
                if (!charToWordMap.get(patternChar).equals(word)) 
                //use equals() instead of == or != because .equals() compares content stored in memory
                //whereas == cheks whether variables are pointing to sae object i.e memory address or not.
                {
                    return false; // Current patternChar maps to a different word than expected
                }
            } else {
                charToWordMap.put(patternChar, word);
            }

            // Check word->pattern mapping
            if (wordToCharMap.containsKey(word)) 
            {
                if (wordToCharMap.get(word) != patternChar) 
                {
                    return false; // Current word maps to a different patternChar than expected
                }
            } 
            else 
            {
                wordToCharMap.put(word, patternChar);
            }
        }

        return true;
    }
}
