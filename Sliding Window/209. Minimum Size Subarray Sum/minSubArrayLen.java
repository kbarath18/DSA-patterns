import java.util.*;

class minSubArrayLen{
	public static void main(String[] args){

		int target = 7;
		int[] nums = {2,3,1,2,4,3};


		System.out.print(minSubArrayLen(target, nums));

	}



	static int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int start = 0;
        int end = 0;
        int maxLen = Integer.MAX_VALUE;

        while(end < nums.length){
        	sum += nums[end];

        	while(sum >= target){
        		int length = end - start + 1;
        		maxLen = Math.min(length, maxLen);
        		sum -= nums[start++];
        	}

        	end++;
        }

         return maxLen == Integer.MAX_VALUE ? 0 : maxLen;

    }

}