//check whether two trees are symmteric or not (mirror image)
class Prob101 
{
    public boolean isSymmetric(TreeNode root) 
    {
        boolean symmetric=isMirror(root.left,root.right);
        return symmetric;
    }
    //have to traverse left right simultaneously
    //define new method with both left right parameters for recursive calls
    public boolean isMirror(TreeNode left,TreeNode right)
    {
        //base case:null nodes are symmetric
        if(left==null && right==null)
        {
            return true;
        }
        
        //one is null, other is not: non symmetric
        if(left==null ^ right==null )
        {
            return false;
        }
        
        return(left.val==right.val && isMirror(left.left,right.right) && isMirror(left.right,   right.left));
        //check whether values are equal
        //recursively repeat for extreme nodes (left.left and right.right) and closest nodes(left.right and right.left)

    }
