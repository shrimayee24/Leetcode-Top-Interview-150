//checking for valid palindrome
class Prob125
{
    public boolean isPalindrome(String s) 
    {
      //remove whitespaces and alphanumeric characters
      //i.e remove those characters which are not upperase, lowercase or digits 
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

      //two-pointer approach
      //symmetric checking each char from front and back (mirror image)
        int front=0,back=s.length()-1;
      
      //pointers should not cross each other
        while(front<back)
        {
          //if hars dont match, dont heck further
            if(s.charAt(front)!=s.charAt(back))
            {
                return false;
            }
            front++;
            back--;
            
        }
return true;
    }
}
