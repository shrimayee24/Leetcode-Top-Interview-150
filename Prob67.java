//addition of two binary numbers
class Prob67 
{
    public String addBinary(String a, String b) 
    {
        //start from units place,initialise carry and sum for each digit
        int n1=a.length()-1,n2=b.length()-1,carry=0,sum=0;
     
        StringBuilder sb=new StringBuilder();//to store result
        while(n1>=0 || n2>=0)
       {
            int bitA= (n1>=0) ? Character.getNumericValue(a.charAt(n1)) : 0;
            //if length of a is shorter than b add zero to character of b at index a.length()
            int bitB= (n2>=0) ? Character.getNumericValue(b.charAt(n2)) : 0;
            //similiarly for string b
            sum=bitA+bitB+carry;
            //calculate sum at each position of digits starting at units place, then tens so on.
            int val=sum%2;  carry=sum/2;
            //update value of digit and carry for next iteration
            sb.append(val);
            //append value to string builder
            n1--;
            n2--;
            //move to one place left
        }
        if(carry!=0)
        {
             sb.append(carry);
        }
        //if carry remains,append it to the string of values
       
        
        return sb.reverse().toString();
        //as values stored in order of addition, least latest value is printed first. 
        //so reverse string

        
    }
}
