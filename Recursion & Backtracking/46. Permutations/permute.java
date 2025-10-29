import java.util.*;


class permute{
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<List<Integer>> ans =  new ArrayList<>();
		permutation(nums, new ArrayList<>(), ans);

		System.out.print(ans);

	}

	static void permutation(int[] nums, List<Integer> list, List<List<Integer>> ans){
		if(list.size() == nums.length){
			ans.add(new ArrayList<>(list));
			return;
		}

		for(int i = 0;i<nums.length;i++){
			if(list.contains(nums[i])) continue;

			list.add(nums[i]);
			permutation(nums, list, ans);
			list.remove(list.size()-1);
		}
	}

}