import java.util.*;

class searchRange{
	public static void main(String[] args){
		int[] nums = {5,7,7,8,8,10};
		int target = -8;

		int[] ans = searchRange(nums, target);

		System.out.print(Arrays.toString(ans));
	}

	static int[] searchRange(int[] nums, int target) {
        int firstElement = -1;

        int low = 0;
        int high = nums.length-1;
        // first occurence
        while(low <= high){
        	int mid = (low + high) /2;
        	if(nums[mid] == target){
        		firstElement = mid;
        		high = mid-1;
        	}else if(nums[mid] > target)
        		high = mid-1;
        	else 
        		low = mid+1;
        }

        if(firstElement == -1)
        	return new int[] {-1, -1};


        // last occurence
        int secondElement = -1;

        low = 0;
        high = nums.length-1;

        while(low <= high){
        	int mid = (low + high) / 2;
        	if(nums[mid] == target){
        		secondElement = mid;
        		low = mid+1;
        	}else if(target > nums[mid])
        		low = mid+1;
        	else 
        		high = mid-1;
        }

        return new int[] {firstElement, secondElement};
    }
}