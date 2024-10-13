//find common prefix i.e common substring starting at index 0 in all strings

class Prob14 {
    public String longestCommonPrefix(String[] strs) 
    {
        //sort in alphabetical order
        Arrays.sort(strs);
        
        //common prefix between first and last string exists, same prefix exists bet      middle strings too
     String first=strs[0];
        String last=strs[strs.length-1];
        int index=0;
        
        //str[0] has least length-only iterate till length of first string.
        while(index<first.length())
        {
            if(first.charAt(index)==last.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }

        }
    
    //return substring matched till index iterated
    return first.substring(0,index);


    }
}
