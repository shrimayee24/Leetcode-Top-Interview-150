//count number of nodes in a tree
class Solution {
    public int countNodes(TreeNode root) 
    {
        Queue<TreeNode> visited=new LinkedList<>();
        //to store all visited nodes
        
        Queue<TreeNode> current=new LinkedList<>();
        //to store nodes only at current level.

        if(root==null)
        {
            return 0;
        }
        current.add(root);
        //visit root node
        while(!current.isEmpty())
        //iteratively visit child nodes of root nodes using level order traversal
        {
           TreeNode currnode=current.poll();
           visited.add(currnode);
           //remove current node and add to visited queue.

           //add left and right children of current node 
           if(currnode.left!=null)
           {
              current.add(currnode.left);
           }
           if(currnode.right!=null)
           {
            current.add(currnode.right);
           }
        }
     return visited.size();
     //total number of visited nodes=size of queue.
    }
}
