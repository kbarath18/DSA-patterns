
import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

class hasCycle{
	public static void main(String[] args){
		// call the function here
	}

	public boolean hasCycle(ListNode head) {
		if(head.next == null)
			return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast == slow)
        		return true;
        }

        return false;
        
    }
}