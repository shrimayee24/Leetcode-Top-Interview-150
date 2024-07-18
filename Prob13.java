//import java.util.Hashmap;
class Prob13
{
    public int romanToInt(String s) 
    {
        Map<Character, Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        //iterate backwards- starting from last element
        int ans=roman.get(s.charAt(s.length()-1));

        //iterate starting from second last character
        for(int i=s.length()-2; i>=0; i--)
        {
if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1)))
{
    ans-= roman.get(s.charAt(i));
}
else
{
    ans+= roman.get(s.charAt(i));
}
        }
        return ans;
        }
     
     
    }
