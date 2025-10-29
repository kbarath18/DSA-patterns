import java.util.*;

class combinationSum2{
	public static void main(String[] args){
		List<List<Integer>> answer = new ArrayList<>();
		int[] candidates = {1,1,1,2,2};
		Arrays.sort(candidates);
		int target = 4;
		combinationSum2(0, candidates, target, new ArrayList<>(), answer);

		System.out.print(answer);
	}

	static void combinationSum2(int index, int[] nums, int target, List<Integer> list, List<List<Integer>> answer){
		if(target == 0){
			answer.add(new ArrayList<>(list));
			return;
		}

		if(index >= nums.length || target < 0)
			return;

		for(int i = index;i<nums.length;i++){
			if(i >  index && nums[i] == nums[i-1])
				continue;

			if(nums[i] > target)
				return;

			list.add(nums[i]);
			combinationSum2(i+1, nums, target-nums[i], list, answer);
			list.remove(list.size()-1);
		}
		
	}
}