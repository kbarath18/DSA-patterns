import java.util.*;

class threeSumClosest{
	public static void main(String[] args){
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.print(threeSumClosest(nums, target));
	}

	static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minGap = Integer.MAX_VALUE;
        int ans = -1;

        for(int i = 0;i<nums.length;i++){
        	// skip the duplicates
        	if(i > 0 && nums[i-1] == nums[i]) continue;

        	int start = i+1;
        	int end = nums.length-1;

        	while(start < end){


        		int sum = nums[i] + nums[start] + nums[end];

	        	if(sum == target){
	        		return target;
	        	}

	        	int close = Math.abs(sum - target);

	        	if(minGap > close){
	        		minGap = close;
	        		ans = sum;
	        	}

	        	if(sum > target){
	        		end--;
	        	}else{
	        		start++;
	        	}
        }

        // end of the for loop
        }

        return ans;

    }
}