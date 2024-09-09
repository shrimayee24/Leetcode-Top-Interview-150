//check whether two trees are identical or not
 //identical when structure is same and values at same node positions are equal.
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        //base case: 2 empty nodes at same positions are equal,return true
        if(p==null && q==null)
        {
            return true;
        }
        
        //if 1 empty node, 1 non empty node at same positions, return false
     if(p==null ^ q==null)
     {
          return false;
     }
        //if 2 non empty nodes at same positions but values are not equal,return false
        if(p.val!=q.val)
        {
            return false;
        }
        //if 2 non-empty nodes and values equal, further explore through recursion
        //if both subtrees are identical recursively, then whole tree is identical
        
           return(isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
            
        
       
    }
