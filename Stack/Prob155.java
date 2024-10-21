//stack functions with O(1) complexity
class Prob155
{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() 
    {
        // No need to reassign the stacks in the constructor.
    }
    
    public void push(int val) 
    {
       // If the minstack is empty or currvalue is <= top of minstack, the current value is the minimum
       if (minstack.isEmpty() || val <= minstack.peek()) 
       {
           minstack.push(val);
       }
       //by default push value into stack
       stack.push(val);
    }
    
    public void pop() 
    {
        if (stack.isEmpty()) return;
        // If the popped value is the current minimum, pop it from the minstack as well
        if (stack.peek().equals(minstack.peek())) 
        {
            minstack.pop();
        }
        stack.pop();
    }
    
    public int top() 
    {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() 
    {
        // Return the top value of the minstack, which is the current minimum
        return minstack.peek();
    }
}

