import java.util.*;

public class moveZeroes{
	public static void main(String[] args){

		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);

	}

	static void moveZeroes(int[] nums) {
        int k = 0;

        for(int i = 0;i<nums.length;i++){
        	if(nums[i] != 0){
        		nums[k] = nums[i];
        		nums[i] = 0;
        		k++;
        	}
        }
    }
}
