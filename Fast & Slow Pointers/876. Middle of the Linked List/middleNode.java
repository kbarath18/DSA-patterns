
import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

class middleNode{
	public static void main(String[] args){
		// call function here
	}

	public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
        	return head;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }

        return slow;
    }
}