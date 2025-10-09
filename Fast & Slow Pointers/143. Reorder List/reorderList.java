import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }


class reorderList{

	public static void main(String[] args){
		// call function here
	}


	static void reorderList(ListNode head) {
        // find the middle element 
        //  and reverse the from middle to end
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        slow.next = null;

        ListNode first = head;

        while(second != null){
        	ListNode temp1 = first.next;
        	ListNode temp2 = second.next;

        	first.next = second;
        	second.next = temp1;

        	first = temp1;
        	second = temp2;
        }


    }

    static ListNode reverse(ListNode head){
    	if(head == null || head.next == null)
    		return head;

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