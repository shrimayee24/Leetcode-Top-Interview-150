//merge two sorted lists into one sorted list
class Prob21
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode dummy=new ListNode(0);
        //initialize a dummy node of new list with value as 0
        ListNode curr=dummy;
        //curr=pointer of new list is at dummy node
        while(list1!=null && list2!=null)
        //iterate till l1 and l2 reach tail nodes.
      {
         if(list1.val<=list2.val)
        {
            curr.next=list1;
            //if value of l1 is less than or equal to value at l2, place reference of value=l1 first at next position to curr pointer
            list1=list1.next;
            //move l1 by one position in list1.
        }
        else
        {
            curr.next=list2;
            //else place reference of value=l2 first next to curr pointer
            list2=list2.next;
            //move l2 pointer by one position in list2.
        }
        curr=curr.next;
        //after placing values, move curr pointer by one position to place next values
    }
      if(list1==null)
      {
        curr.next=list2;
      }
      else
      {
        curr.next=list1;
      }
      //if any of the pointer in the list reaches to end first, there are some values left in other list when we come out of while loop.
      //place those nodes in the new list
      
      return dummy.next;
      //return all nodes placed after dummy node.
        
    }
    
}
