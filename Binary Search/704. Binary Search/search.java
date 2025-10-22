import java.util.*;

class search{
	public static void main(String[] args){
		int[] nums = {-1,0,3,5,9,12};
		int target = -12;

		System.out.print(search(nums, target));
	}

	static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
        	int mid = (start + end) / 2;
        	if(nums[mid] == target)
        		return mid;
        	else if(nums[mid] > target)
        		end = mid-1;
        	else 
        		start = mid+1;
        }

        return -1;
    }

    static int lowerBound(int[] nums, int target){
    	int low = 0;
    	int high = nums.length-1;

    	while(low <= high){
    		int mid = (low + high) / 2;
    		if(nums[mid] >= target) high = mid - 1;
    		else low = mid+1;
    	}

    	return low;
    }

}