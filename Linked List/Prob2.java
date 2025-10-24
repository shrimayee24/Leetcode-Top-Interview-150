/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//add 2 numbers in ll
class Prob2 {

    //list is created sequentially from units place onwards.
    //so it becomes simple to add result nodes from units place onwards as we do addition starting from units place.
    //val field is the actual data (or value) stored in the node, not the index.
      //next-Points to the next node in the list
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      //A dummy node is created with a value of 0. This is used to simplify the handling of edge cases.
      //The dummy node is not part of the final result; it just helps make list manipulation easier.
      
        ListNode dummy = new ListNode(0);
        
        //p and q are pointers to first node of their respective lists
        //p does not point to the entire l1 list.It only holds a reference to the first node as list can be traversed after that. Similiarly for q.
        ListNode p = l1;
        ListNode q = l2;

        //Initialize a pointer curr to dummy node.
        ListNode curr = dummy;

        //carry to store tens digit of sum>9
        int carry = 0;

//iterate until end of atleast one list
while(p!=null || q!=null)
        {
            //if one list is shorter than other and ends first, put dummy node with val=0 at end of that list
            //If p is not null (i.e., there is still a node in l1), get its value (p.val). Otherwise use 0.
            int x = p!=null ? p.val : 0;

            //Similarly, if q is not null, get its value (q.val). Otherwise, use 0.
            int y = q!=null ? q.val : 0;

            //calculate sum for current nodes in l1 and l2
            int sum= x+y+carry;

            //for sum>9 carry=1. else carry=0.
            carry=sum/10;

//attach present result node to dummy node initially or to prev result node, then move curr from dummy node to present result node.
            
            //result node starts from dummy node, we are connecting the current result nodes to dummy node as curr is pointing to dummy node initially.
            //store only units digit in the current node of result node.
            curr.next = new ListNode(sum%10);

            //set curr from dummy node to current result node initially, then from prev result node to present result node.
            curr=curr.next;

//move p to next node in list l1
            if(p!=null)
            p=p.next;
//move q to next node in l2
            if(q!=null)
            q=q.next;
        }

        //if there is still a carry left after traversing both lists,for e.g  last nodes of l1 and l2 were 6 and 4 respectively, then store the carry as last node of the result list.
        if(carry>0)
        {
            curr.next=new ListNode(carry);
        }

        //return result list starting from node next to dummy.
        return dummy.next;
    }
}
