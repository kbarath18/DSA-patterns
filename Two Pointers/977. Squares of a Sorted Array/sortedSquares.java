import java.util.*;

class sortedSquares{
	public static void main(String[] args){
		int[] nums = {-4,-1,0,3,10};
		int[] ans = sortedSquares(nums);
		System.out.print(Arrays.toString(ans));
	}

	static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int index = ans.length-1;

        int start = 0;
        int end = ans.length-1;

        while(start <= end){
        	int firstSquare = nums[start] * nums[start];
        	int lastSquare = nums[end] * nums[end];

        	if(firstSquare > lastSquare){
        		ans[index--] = firstSquare;
        		start++;
        	}else{
        		ans[index--] = lastSquare;
        		end--;
        	}

        }
        return ans;
    }
}