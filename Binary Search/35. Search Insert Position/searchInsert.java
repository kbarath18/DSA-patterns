import java.util.*;

class searchInsert{
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		int target = 6;
		System.out.print(searchInsert(nums, target));
	}

	static int searchInsert(int[] nums, int target) {
        // same as upper bound
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
        	int mid = (start + end) / 2;
        	if(nums[mid] >= target) end = mid-1;
        	else start = mid+ 1;
        }

        return start;
    }

}