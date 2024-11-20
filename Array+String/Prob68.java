//text justification
class Solution 
{
    public List<String> fullJustify(String[] words, int maxWidth) 
    {
        //add words first greedily with 1 space to each line
       List<String> lines=greedyAppend(words,maxWidth);
       
       //pad extra spaces in each line
       List<String> result=appendSpaces(lines,maxWidth);

      return result;
        
    }
    
    //method to first greedily append words till maxwidth reached
    //append only 1 space first
     public List<String> greedyAppend(String[] words, int maxWidth) 
     {
    List<String> res = new ArrayList<>();
    int i = 0;

//iterate through each word
    while (i < words.length) 
    {
        //create new line
        StringBuilder currline = new StringBuilder();

        //iterate through each word in array
        //check whether i is not out of bounds and length of stringbuilder and current word adding doesnt exceed length limit-add word to line with space
        //else create a new line and add the word to that line
        while (i < words.length && currline.length() + words[i].length()<= maxWidth) {
    
            currline.append(words[i]);
            currline.append(" ");
            i++; // Move to the next word
        }

//remove trailing space of last word
        res.add(currline.toString().trim()); // Add the line to the result
    }

    return res;
   }

//method to pad extra spaces
  public List<String> appendSpaces(List<String> lines, int maxWidth) {
    List<String> justifiedLines = new ArrayList<>();

    for (int k = 0; k < lines.size(); k++) 
    {
        //get each line from the list of lines
        String eachLine = lines.get(k);
        
        //split all words into an array of string using whitespace as delimiter
        String[] words = eachLine.split(" ");
        
        //use stringbuilder to append spaces evenly
        StringBuilder modifyLine = new StringBuilder();

    
        //if k reaches last line or the current line has only one word-left justify
        if (k == lines.size() - 1 || words.length == 1) 
        {
            for (String word : words) 
            {
                modifyLine.append(word).append(" ");
            }
            
            // Remove trailing space and add remaining spaces to the end
            modifyLine.setLength(modifyLine.length() - 1); // Remove extra trailing space
            
            //keep on adding spaces at end of each word until maxwidth reached
            while (modifyLine.length() < maxWidth) 
            {
                modifyLine.append(" ");
            }
        } 
        
        //else-right justify
        else 
        {
            // Evenly distribute spaces for all other lines
            //find total length of line without spaces using eachLine.replace(" ", "").length()-replace whitespace with blank character and find length of modified string
            int lengthOfWords=eachLine.replace(" ", "").length();
        
            //find spaces need to be added between words by taking difference of maxwidth and length of line without spaces
            int totalSpaces = maxWidth -lengthOfWords ;
            
            //total spaceholders for n words=n-1
            int spaceHolders=words.length - 1;
            
            //divide spaces between words among each spaceholder
            int spacesBetweenWords = totalSpaces /spaceHolders ;
            
            //find if extra spaces needed to be added or not after even distribution of spaces
            int extraSpaces = totalSpaces % spaceHolders;

            // Build the justified line
            //pad spaces until second last word,last word has no spaces after it
            for (int i = 0; i < words.length - 1; i++) 
            {
                //append current word in line
                modifyLine.append(words[i]);
                
                //distribute spaces-append number of spaces for each spaceholder
                for (int j = 1; j <= spacesBetweenWords; j++) 
                {
                    modifyLine.append(" ");
                }
                
                //after even space distribution-if n extraspaces are there,add 1 extra space after every word for first n words
                //if 2 extra spaces are left, add 1 extra space after 0th word, 1 extra space after 1st word
                if (i < extraSpaces) 
                {
                    modifyLine.append(" "); // Add one extra space to the leftmost gaps
                }
            }
            
            // Append the last word
            modifyLine.append(words[words.length - 1]);
        }

        justifiedLines.add(modifyLine.toString());
    }

    return justifiedLines;
}



        
    }
    
    
