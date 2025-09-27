import java.util.*;

public class sortColors{
	public static void main(String[] args){
		int[] nums = {2,1};

		sortColors(nums);

		System.out.print(Arrays.toString(nums));
	}

	static void sortColors(int[] nums) {
       	
       	int start = 0;
       	int end = nums.length-1;
       	int mid = 0;

       	while(mid <= end){

       		int num = nums[mid];
       		if(num == 1){
       			mid++;
       		}else if(num == 0){
       			swap(nums, start, mid);
       			start++;
       			mid++;
       		}else if(num == 2){
       			swap(nums, mid, end);
       			end--;
       		}

       	}

    }

    static void swap(int[] nums, int start, int end){
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    }
}