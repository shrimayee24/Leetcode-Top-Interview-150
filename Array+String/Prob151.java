//reverse words in a string
class Prob151 
{
    public String reverseWords(String s) 
    {
        //split string into individual words and store in array
        //split using one or more spaces as delimiter.
        String words[]=s.split(" +");

        StringBuilder sb=new StringBuilder();
        //put words from last index to first index (reverse order) in sb
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            //put space after every word
            sb.append(" ");
        }
        //convert into string
        //since last word contains extra space after it,trim that space.
        return sb.toString().trim();

        
    }
}
