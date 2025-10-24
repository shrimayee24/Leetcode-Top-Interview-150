//reverse polish notation
//push operands until operator encountered
//if operator encountered, pop top 2 numbers and perform operation between them using current operator and store the result at top of stack
//repeat this recursively until end of array reached.
//one number is left in stack which is the result, return it.
class Prob150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stk=new Stack<>();
        for(String token:tokens)
        {
            if(isOperator(token))
            {
                //pop top 2 nos
               int num2=Integer.parseInt(stk.pop());
               int num1=Integer.parseInt(stk.pop());

               //perform operation corresponding to current operator
               int result=0;
               if(token.equals("+")) result=num1+num2;
               else if(token.equals("-")) result=num1-num2;
               else if(token.equals("*")) result=num1*num2;
               else if(token.equals("/")) result=num1/num2;
            
            //push calculated result for current iteration in stack
               stk.push(Integer.toString(result));

               //reset result to 0 for further iterations as stack contains previously calculated results.
               result=0;
            }
            //if current char is operand,push it in stack
            else stk.push(token);
        }
        //convert string to integer and return the result stored
        return Integer.parseInt(stk.pop());
    }

    //function to check whether a char is an operator or not
    public boolean isOperator(String str)
    {
        if(str.equals("+") || str.equals("-") ||str.equals("*") ||str.equals("/")) return true;
        return false;
    }
}
