//calculate hamming weight of a decimal number converted into binary number
//i.e number of 1s in binary number 
class Prob191
{
    public int hammingWeight(int n) 
    {
       ArrayList<Integer> binary=new ArrayList<>();
        int binarydigit=0,count=0;
        
        //convert decimal to binary- division by 2
       while(n>=1)
       {
          binarydigit= n%2;
          //calculate remainder of number divided by 2 (0 or 1)
          binary.add(binarydigit);
          //store binary digit in stringbuilder
          n=n/2;
          //quotient is taken as input for next iteration
       }

       //calculate number of 1s
          for(int isOne: binary)
          //iterating through each integer in arraylist
          {
            //if 1 detected, increment count
             if(isOne==1)
             {
                count++;
             }
          }
          return count;
    }
}
