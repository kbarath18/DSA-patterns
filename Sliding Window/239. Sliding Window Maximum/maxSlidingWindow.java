import java.util.*;

class maxSlidingWindow{
	public static void main(String[] args){
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;

		int[] ans = maxSlidingWindow(nums, k);

		System.out.print(Arrays.toString(ans));
	}

	static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result =  new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0;i<nums.length;i++){
        	// remove the outside of the window k element
        	while(!deque.isEmpty() && deque.peekFirst() <= i - k)
        		deque.removeFirst();


        	// remvoe the smallest element because they are not useful
        	while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
        		deque.removeLast();


        	deque.addLast(i);

        	if(i >= k-1)
        		result[index++] = nums[deque.peekFirst()];
        }

        

        return result;
    }

   
}