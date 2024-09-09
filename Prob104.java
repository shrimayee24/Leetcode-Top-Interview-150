//find maximum height of a tree
 //use depth first search
 //recursively traverse left subtrees and right subtrees and return max depth at each recursive call
 //incrementing levels from bottom to top.

class Prob104
{
    public int maxDepth(TreeNode root) 
    {
        //base case: leaf node null-> level is 0
        if(root==null)
        {
            return 0;
        }
        
        int l=maxDepth(root.left);
        //recursively explore left subtrees with left child recursion first then right child recursion
        
        int r=maxDepth(root.right);
        //recursively explore right subtrees with left child recursion first then right child recursion

        int height=1+Math.max(l,r);
        //add 1 while backtracking to parent when base case achieved
        //parent node is 1 level above child node

        return height;
        //return height of subtrees recursively

        
    }
}
