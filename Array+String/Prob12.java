//integer to roman
//take closest values to number and add them
class Prob12 
{
    public String intToRoman(int num) 
    {
        //arrange values in descending order for getting closest value at each iteration
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder("");
        int i=0;
    
    //put values to stringbuilder which are closest to actual value
    //remaining values to be put is difference of actual value-appended value
    //if difference is 0, that means the number is converted to roman completely

    while(num>0)
    {
        if(num>=values[i])
        {
            sb.append(roman[i]);
            num=num-values[i];
        }
        else
        {
            i++;
        }
    }
    return sb.toString();        
    }
}
