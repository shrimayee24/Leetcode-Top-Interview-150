//invert a binary tree-swap its left and right children

class Prob226
{
    public TreeNode invertTree(TreeNode root) 
    {
        //base case-empty tree or reached leaf node, swapping results in null node only
        if(root==null)
        {
            return null;
        }

        TreeNode temp=root.left;
        //store left child in dummy location called temp
        root.left=root.right;
        //move right child to left position
        root.right=temp;
        //move temp (where left child is located) to right position 

        invertTree(root.left);
        invertTree(root.right);
        //recursively repeat for left and right subtrees

        return root;
        //return swapped roots recursively after base case reached from inner trees to outer   trees.

    }
}
