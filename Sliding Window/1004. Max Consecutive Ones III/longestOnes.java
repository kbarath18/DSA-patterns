import java.util.*;

class longestOnes{
	public static void main(String[] args){
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;

		System.out.print(longestOnes(nums, k));

	}

	static int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int length = 0;


        while(end < nums.length){
        	int num = nums[end];

        	if(num == 0)
        		k--;

        	while(num == 0 && k == -1){
        		// strinking start here
        		if(nums[start] == 0)
        			k++;

        		start++;
        	}

        	length = Math.max(length, (end - start) + 1);


        	end++;
        }

        return length;


    }
}