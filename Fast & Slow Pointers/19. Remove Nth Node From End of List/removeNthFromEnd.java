import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }



class removeNthFromEnd{
	public static void main(String[] args){
		// call function here
	}

	static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;

        ListNode dummy = head;
        for(int i = 0;i<n;i++){
            dummy = dummy.next;
        }
        // first element is deleted
        if(dummy == null)
        	return head.next;

        ListNode slow = head;

        while(dummy != null && dummy.next != null){
        	slow = slow.next;
        	dummy = dummy.next;
        }

        slow.next = slow.next.next;

        return head;

        


    }
}