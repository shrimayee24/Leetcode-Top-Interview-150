//rotate array by k steps
class Prob189
{
    public void rotate(int[] nums, int k) 
    {
        //if array length=1 or rotation steps=0, no rotation can be performed
        if(nums.length==1 || k==0)
        {
            return;
        }
        //when no.of rotations=array length or multiple of array length,after rotation, array restored to original position
        //thus eliminate the rotations=multiples of array length by taking modulus 
        //analogy=modulus clock
        k=k%nums.length;   
       //reverse whole array
        reverse(nums,0,nums.length-1);
        //then reverse first k elements 
        reverse(nums,0,k-1);
        //then reverse remaining elements 
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end)
    {
        //two pointer approach-left and right
        //like palindrome, symmetrically bring pointers closer and swap the elements
        while(start<end)
        {
            //swap elements
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            //move pointers
            start++;
            end--;
        }
    }
}
