//detect cycle in linked list
 
//slow pointer fast pointer approach
 //if two meet- cycle exists

public class Prob141
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow=head, fast=head;
        //at starting both pointers are at head
        while(fast!=null && fast.next!=null)
        //fast is at some object and next pointer shouldnt point to null
        {
            slow=slow.next;
            //traverse slow by 1 step at a time
            fast=fast.next.next;
            //traverse fast by 2 steps at a time
            if(slow==fast)
            //if both are at same object, cycle exists
            {
                return true;
            }
        }
        return false;
    }
}
