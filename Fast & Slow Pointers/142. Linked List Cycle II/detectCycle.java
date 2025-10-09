
import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }



class detectCycle{
	public static void main(String[] args){
		// call function here
	}

	static ListNode detectCycle(ListNode head) {
        if(head == null)
        	return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;

        	if(fast == slow){
        		slow = head;
        		while(slow != null){
        			if(slow == fast)
        				return slow;
        			fast = fast.next;
        			slow = slow.next;
        		}
        	}
        }

        return null;
    }
}