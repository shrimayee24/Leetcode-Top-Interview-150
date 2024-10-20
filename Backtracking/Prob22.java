//add combinations of parenthesis
//use of open and close counters to keep track of number of opening brackets and number of closing brackets
//recursively add opening and closing brackets by incrementing counters in calls of respective if conditions
class Solution 
{
    List<String> result = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) 
    {
        StringBuilder sb = new StringBuilder();
        backtrack(sb, 0, 0, n); // Start with 0 open and 0 close parentheses
        return result;
    }

    public void backtrack(StringBuilder sb, int open, int close, int n) 
    {
        if (sb.length() == 2 * n) // Base condition: when we've used all n pairs of parentheses
        {
            result.add(sb.toString());
            return;
        }

        if (open < n) // Add open parentheses if we haven't reached the limit
        {
            sb.append('('); 
         //keep adding opening brackets till we have space for closing brackets
            backtrack(sb, open + 1, close, n);
            // Backtrack by removing the last added '(' after coming out of call
            sb.deleteCharAt(sb.length() - 1); 
            //after removing open brackets, pointer will go to next if condition to add closing brackets for previous    call
        }
      //if opening brackets=n start adding closing brackets for last call of open
        if (close < open) // Add closing parentheses only if it won't unbalance
        {
            sb.append(')'); 
            //append closing brackets until opening brackets=closing brackets
            backtrack(sb, open, close + 1, n);
           // Backtrack by removing the last added ')' after coming out of call
            sb.deleteCharAt(sb.length() - 1); 
        }

    }
}
