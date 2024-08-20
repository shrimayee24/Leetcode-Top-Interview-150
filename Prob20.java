//check whether input string is a valid parantheses or not 
//i.e if brackets are in correct sequence or not

import java.util.HashMap;
import java.util.Stack;

class Prob20
{
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        //map opening brackets to corresponding closing brackets
        //here keys are the closing brakets mapped to their corresponding opening bracket values.
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        for (char c : s.toCharArray())
        //convert string to character array and heck for each character 
        {
            if (brackets.containsValue(c)) 
            {
                // If the character is an opening bracket, push it into the stack
                stk.push(c);
            } 
            else if (brackets.containsKey(c)) 
            {
                // If the character is a closing bracket
                if (stk.isEmpty() || stk.peek() != brackets.get(c)) 
                {
                    // If the stack is empty or the top of the stack is not an opening   bracket corresponding to its closing bracket, return false
                    return false;
                }
                stk.pop(); 
                //if closing bracket matched to opening bracket at top of stack, Pop the   matched opening bracket
            }
        }
        
        // If the stack is empty, all the opening brackets have been matched correctly
        return stk.isEmpty();
    }
}
