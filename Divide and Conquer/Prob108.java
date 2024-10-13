//construct height balanced BST from sorted array in ascending order
//binary search like approach
class Prob108
{
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        //base case- array is empty, return null
        if(nums.length==0)
        {
            return null;
        }
        return createBST(nums,0,nums.length-1);
    }
   public TreeNode createBST(int nums[], int start, int end)
   {
       //base case for recursion- pointers should not cross each other
       if(start>end)
       {
        return null;
       }
       //calculate middle value
       int mid= start+ ((end-start)/2);

       //assign middle value as root, root= middle because: 
     //no.of elements to left=no.of elements to right whih ensures that tree is balanced.
     //all elements to left of middle elements are always less than elements to right side of middle element-helpful for BST construction
     //pass middle value in constructor
       //construtor assigns left right pointers to root
    TreeNode root= new TreeNode(nums[mid]);
    
    
    //recursively form left subtrees by assigning left pointers to values which are less than middle values
    root.left= createBST(nums, start,mid-1);
   //recursively form right subtrees by assigning right pointers to values which are greater than middle values
    root.right=createBST(nums, mid+1, end);
    return root;
      
   }
}
