import java.util.*;

class threeSum{
	public static void main(String[] args){
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = threeSum2(nums);
		System.out.print(list);
	}

	static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
        	int start = i+1;
        	int end = nums.length-1;

        	while(start < end){
        		int sum = nums[i] + nums[start] + nums[end];
        		if(sum == 0){
        			List<Integer> ans = new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end]));
        			set.add(ans);
        			start++;
        			end--;
        		}else if(sum > 0)
        			end--;
        		else 
        			start++;
        	}

        }

        for(List<Integer> ans : set)
        	list.add(ans);


        return list;
       	 
    }

    static List<List<Integer>> threeSum2(int[] nums) {
    	List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){

        	// skip the duplicate
        	if (i > 0 && nums[i] == nums[i - 1]) continue;

        	int start = i+1;
        	int end = nums.length-1;

        	while(start < end){
        		int sum = nums[i] + nums[start] + nums[end];

        		if(sum == 0){
        			list.add(Arrays.asList(nums[i], nums[start], nums[end]));

        			while(start < end && nums[start+1] == nums[start]) start++;

        			while(start < end && nums[end] == nums[end-1]) end--;

        			start++;
        			end--;

        		}else if(sum > 0)
        			end--;
        		else 
        			start++;


        	}
        }

        return list;
    }



}