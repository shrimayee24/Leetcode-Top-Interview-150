//to find average of all nodes at current tree level and store average in a list.
//level order traversal (breadth first search) using queue.
//iterative approach
class Prob637 
{
    public List<Double> averageOfLevels(TreeNode root) 
    {
        // List to store average values at each level
        List<Double> result = new ArrayList<>();
        
        // Queue for level-order traversal (BFS)
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null)
        //if tree is empty, return list as it is (empty) 
        {
            return result;
        }
        
        q.add(root); // else add root object
        
        while (!q.isEmpty()) 
        // current while loop iteration= current level
        {
            int size = q.size(); // Number of nodes at current level= size of queue for current iteration
            double sum = 0;      // Sum of node values at current level (current iteration)
            
           //for loop-to add currnode values in sum, remove them, add nodes of next level for next while loop iteration.
        
            for (int i = 0; i < size; i++) 
            {
                TreeNode current = q.poll(); // Get the current node
                sum += current.val; // Add current node value to the sum
                
                // Add the child nodes to the queue for the next level
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
            
            // Calculate the average of the current level and add to the result list
            result.add(sum / size);
            //size will be either 1 or 2 only.
        }
        
        return result; // Return the list of averages
    }
}
