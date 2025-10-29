import java.util.*;

class permuteUnique{
	public static void main(String[] args){
		int[] nums = {1,1,2};
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();

		boolean[] used = new boolean[nums.length];
		permutation(nums, used, new ArrayList<>(), ans);
		System.out.print(ans);	

	}

	static void permutation(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> ans){
		if(list.size() == nums.length){
			ans.add(new ArrayList<>(list));
			return;
		}


		for(int i = 0;i<nums.length;i++){
			if (used[i]) continue;

			if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

			used[i] = true;
			list.add(nums[i]);

			permutation(nums, used, list, ans);
			list.remove(list.size()-1);

			used[i] = false;
		}
	}
}