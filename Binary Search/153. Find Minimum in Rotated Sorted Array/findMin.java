import java.util.*;

class findMin{
	public static void main(String[] args){
 		int[] nums = {3,4,0,1,2};
 		System.out.print(findMin(nums));
	}

	static int findMin(int[] nums) {
        int minEle = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
        	int mid = start + (end - start) / 2;
        	// left side is sorted
        	if(nums[start] <= nums[mid]){
        		minEle = Math.min(minEle, nums[start]);
        		start = mid+1;
        	}else{
        		// right side is sorted
        		minEle = Math.min(minEle, nums[mid]);
        		end = mid-1;
        	}
        }

        return minEle;
    }
}