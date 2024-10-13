//letter combinations of phone number
//backtracking-depth first search
//recursively add letter combos for each digit
//if cannot add further letter to current combo,backtrack to previous combo to add new letters
class Solution 
{
    List<String> result=null;
    //instead of using hashmap,store combinations of a particular digit at index number=digit.
    String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) 
    {
        result = new ArrayList<>();
        if(digits.length()==0) return result;
        dfs(0,digits,new StringBuilder());
        return result;
    }
    
    void dfs(int length,String digits,StringBuilder temp){
        if(length == digits.length()){
            result.add(temp.toString());
            return;
        }
        
        //get character of current recursive call
        char ch= digits.charAt(length);
        //find index of combo using ch-'0' which leads to difference in ascii values of characters
        //thus the char ch is converted to integer to find index
        String str = mapping[ch-'0'];
        //loop through each character of letter combo of digit in current recursive call
        for(char c:str.toCharArray()){
            //append first character of letter combo
            temp.append(c);
            //add character of letter combo of next digit
            //if length reached, add current combo to stringbuilder
           dfs(length+1,digits,temp);
           
             //delete last character to add further letters of last digit
            temp.deleteCharAt(temp.length()-1);

          //if combos with all letters made of latest digit,backtrack to previous digit to add next letter in combo and use it to add letters of further digits.
        }
    }
}
