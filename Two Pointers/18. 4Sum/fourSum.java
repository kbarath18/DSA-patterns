import java.util.*;

class fourSum{
	public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.print(result);
	}

	static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);


        for(int i =0;i<nums.length-2;i++){

            // skip the duplicates values
            if(i > 0 && nums[i] == nums[i-1]) continue;

        	int first = i+1;
            

            while(first < nums.length-2){


                int start = first + 1;
                int end = nums.length-1;

                while(start < end){
                long sum = (long) nums[i] + nums[first] + nums[start] + nums[end];
                if(sum == target){
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[first], nums[start], nums[end])));

                    while(start < end && nums[start] == nums[start+1]) start++;
                    while(start < end && nums[end] == nums[end-1]) end--;
                    while(first < nums.length-2 && nums[first] == nums[first+1]) first++;

                    start++;
                    end--;

                }else if(sum > target)
                    end--;
                else 
                    start++;
            }

                first++;
            }

            

        }


        return result;
    }

}