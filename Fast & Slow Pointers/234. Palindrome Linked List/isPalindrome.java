
import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

class isPalindrome{
	public static void main(String[] args){
		// call function here
	}

	static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        	return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }

        ListNode second = reverse(slow); // second half linkedList 
        ListNode secondHead = second;

        ListNode first = head;

        while(second != null){
        	if(first.val != second.val)
        		return false;
        	first = first.next;
        	second = second.next;
        }

        slow.next = reverse(secondHead);

        return true;

    }

    static ListNode reverse(ListNode head){
    	ListNode prev = null;
    	while(head != null){
    		ListNode nextNode = head.next;
    		head.next = prev;
    		prev = head;
    		head = nextNode;
    	}

    	return prev;
    }
}