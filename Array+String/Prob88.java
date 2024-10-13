//merge 2 sorted arrays into a single array
//start from last elements in nums1 and nums2 and compare them
//fill them in decreasing order of placeholders (zeros in nums1)
//bubble sort in descending order

class Prob88 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
       int i=m-1, //last element of nums1
       j=n-1, //last element of nums2,
       k=m+n-1; //last zero in mums1 array
       while(j>=0) //traverse in reverse order of nums2 array till all elements are covered
       {
         if(i>=0 && nums1[i]>nums2[j]) //if element starting from last is nums1 is greater than last element in nums2, place nums1 element to the kth placeholder (zeros)
         {
            nums1[k]=nums1[i];
            //once filled move to next positions of k and i
            k--;
            i--;
         }
         else
         //less than or equal to
         //if equal to, doesnt matter place either nums1 or nums2 elemnt a that kth position.
         {
            nums1[k]=nums2[j];
            //once filled move to next positions of k and j
            k--;
            j--;
         }

       }     
    }
}
