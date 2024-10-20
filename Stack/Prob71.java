//simplify unix filepath
class Prob71 
{
    public String simplifyPath(String path) 
    {
        Stack<String> stk=new Stack<>();
        //seperate strings between backslashes
        String[] directories=path.split("/");
        for(String directory:directories)
        {
            //if string is . or it is empty(2 or more backslashes) ignore
            if(directory.equals(".") || directory.isEmpty()) continue;
            
            //if string is .. switch to previous directory by popping out current directory from stack
            if(directory.equals(".."))
            {
                if(!stk.isEmpty()) stk.pop();
            }  
            //else add the valid string directory
            else stk.push(directory);
        }
        //join the strings in stack using backslashes in stringbuilder
        StringBuilder sb=new StringBuilder();
        for(String dir:stk)
        {
            //add backslash first then the string
            //also ensures no backslash at end
            //string on top goes to last so append method
            sb.append("/");
            sb.append(dir);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}
