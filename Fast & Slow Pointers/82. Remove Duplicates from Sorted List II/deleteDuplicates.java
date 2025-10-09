import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }


class deleteDuplicates{
	public static void main(String[] args){
		// call function here
	}

  static ListNode deleteDuplicates2(ListNode head){
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    head = dummy;
    ListNode prev = dummy;
    ListNode curr = head;

    while(curr != null){

      if(curr.next != null && curr.val == curr.next.val){

        while(curr.next != null && curr.val == curr.next.val)
          curr = curr.next;

        prev.next = curr.next;

      }else{
        prev = prev.next;
      }

      curr = curr.next;
    }
      
      // return 
    return dummy.next;
  }

	static ListNode deleteDuplicates(ListNode head) {
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> dupicates = new HashSet<>();
        ListNode temp = head;

        while(temp != null){
        	int data = temp.val;
        	
        	if(dupicates.contains(data)){
        		temp = temp.next;
        		continue;
        	} 	

        	if(linkedSet.contains(data)){
        		dupicates.add(data);
        		linkedSet.remove(data);
        	}else{
        		linkedSet.add(data);
        	}

        	temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode dHead = dummy;

        for(int num: linkedSet){
        	dummy.next = new ListNode(num);
        	dummy = dummy.next;
        }

        return dHead.next;
  }

}