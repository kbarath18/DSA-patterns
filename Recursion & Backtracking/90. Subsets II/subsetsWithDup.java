import java.util.*;

class subsetsWithDup{
	public static void main(String[] args){
		int[] nums = {1,2,2};
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		subset(0, nums, new ArrayList<>(), ans);

		System.out.print(ans);
	}

	static void subset(int index, int[] nums, List<Integer> list, List<List<Integer>> ans){
		
		ans.add(new ArrayList<>(list));

		// using for loops
		for(int i = index;i<nums.length;i++){
			if(i > index && nums[i] == nums[i-1]) continue;

			list.add(nums[i]);
			subset(i+1, nums, list, ans);
			list.remove(list.size()-1);
		}

	}
}