 //use in-order traversal
 //adjacent nodes have minimum difference 
class Prob530 
{
    int diff = Integer.MAX_VALUE; // Set difference to the maximum value for comparison.
    Integer prev = null; // Use Integer object to handle null (no previous node).

    public int getMinimumDifference(TreeNode root) 
    { 
        //base case=tree empty -diff is 0
        if (root == null)
        {
            return 0;
        }

        // In-order traversal: Left -> Node -> Right.
        //recursively explore left subtree
        getMinimumDifference(root.left);
        
        //process root
        // If 'prev' is not null, compute the minimum difference.
        if (prev != null)
        {
            diff = Math.min(diff, root.val - prev);
        }
        
        // Update 'prev' to the current node value for next recursive call.
        prev = root.val;
        
        //recursively explore right subtree
        getMinimumDifference(root.right);

        return diff;
    }
}
