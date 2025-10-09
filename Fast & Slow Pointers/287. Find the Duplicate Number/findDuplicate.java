
import java.util.*;

class findDuplicate{
	public static void main(String[] args){
		// call function here
		int[] nums = {1,3,4,1,2};
		System.out.print(FloydsTortoiseandHareAlgorithm(nums));
	}

	static int FloydsTortoiseandHareAlgorithm(int[] nums){
		int slow = nums[0];
		int fast =nums[nums[0]];

		while(fast != slow){
			fast = nums[nums[fast]];
			slow = nums[slow];
		}
		fast = 0;
		while(fast != slow){
			slow = nums[slow];
			fast = nums[fast];
		}

		return fast;
	}

	static int findDuplicate(int[] nums) {
        int[] count = new int[nums.length + 1];
        int ans = -1;
        int freq = 0;
        for(int num: nums){
        	count[num]++;
        	if(freq < count[num]){
        		ans = num;
        		freq = count[num];
        	}
        }
        return ans;
    }
}