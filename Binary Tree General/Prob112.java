//find path which adds up node values to reach a target value
//depth first search-inorder traversal- traverse whole tree depth

class Prob112
{
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
      //retrieve boolean value from method
       boolean flag=calcPath(root,0,targetSum);
       return flag;
    }

    //create new method to calculate and update sum value and to compare with target value at each recursive call
    public boolean calcPath(TreeNode root, int currSum, int targetSum)
    {
        //base case-tree is empty
        if(root==null)
        {
            return false;
        }
         
         //calculate sum by adding value of current node
     currSum+=root.val;

//if reached leaf node, check whether sum has reached target value
//if not, backtrack to previous root node, explore subsequent paths
     if(root.left==null && root.right==null)
     {
        return currSum==targetSum;
     }
     //repeat recursively for left and right subtrees
     return calcPath(root.left,currSum,targetSum)|| calcPath(root.right,currSum,targetSum);       
    }
}
