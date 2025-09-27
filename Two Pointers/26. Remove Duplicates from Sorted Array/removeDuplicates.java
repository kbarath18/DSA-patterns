import java.util.*;

class removeDuplicates{
	public static void main(String[] args){
		int[] nums = {1,1,2};
		System.out.print(method1(nums));
	}

	static int method1(int[] nums){
		int k = 1;

		for(int i = 1;i<nums.length;i++){
			if(nums[k-1] != nums[i]){
				nums[k++] = nums[i];
			}
		}

		return k;
	}
}