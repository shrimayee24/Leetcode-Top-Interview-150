/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//copy list with random pointer
class Prob138 {
    public Node copyRandomList(Node head) {

//edge case-list is empty
if(head==null) return null;

//create map to store node and corresponding copy node to put random pointers
HashMap<Node,Node> map=new HashMap<>();
    
        
//create simple copy first, sequential pointers

        //create a new node as head, copy value of head of old ll 
        Node newhead=new Node(head.val);

        //put the head and its copy in the map
        map.put(head,newhead);
        
        //set a pointer to the next node of oldhead to copy subsequent nodes in new ll
        Node oldtemp=head.next;

        //initialize a pointer to new head and also to connect to next new nodes copied
        Node newtemp=newhead;

//iterate until null of old list is reached
while(oldtemp!=null)
{
//create node to store new copied values-initialize it with next node of old head as new head is already initialized
        Node copynode=new Node(oldtemp.val);

        //store the original node and its corresponding copy node
        map.put(oldtemp,copynode);

        //connect previously copied node (newtemp) to currently copied node (copynode)
        newtemp.next=copynode;

        //move the pointers for traversing ll

        //move pointer of old ll to next node
        oldtemp=oldtemp.next;

        //move pointer of new ll to next node (copynode)
        newtemp=newtemp.next;
}
        
//copy random pointers to new linked list
//reinitialize pointers to heads
oldtemp=head;
newtemp=newhead;

//put random pointers in new list
while(oldtemp!=null)
{
    //while traversing each original node, check to which node its random pointer is pointing to (old.temp.random)
    //the node is the key and its copy is the value
    Node mapnode=map.get(oldtemp.random);

    //point the random pointer of new list to the respective copy node
    newtemp.random=mapnode;

    //traverse to next nodes
    oldtemp=oldtemp.next;
    newtemp=newtemp.next;

}
 return newhead;
    }
   
}
