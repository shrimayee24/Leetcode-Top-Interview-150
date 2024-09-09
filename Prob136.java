//check for unique element in array of duplicate elements

//xor the values since duplicate values occur twice, xor nullifies them
//only left is single unique element
//even no of bits= xor is false or 0
//odd no of bits= xor is true or 1;
//in this case= xor is  xor addition of binary representation of integers

class Prob136
    public int singleNumber(int[] nums) 
    {
        int value=0;
        //initialize value to return
        for(int i=0; i<nums.length;i++)
        {
            value=value^nums[i];
            //keep on xoring all values iteratively
        }
        
        return value;
    }
}
