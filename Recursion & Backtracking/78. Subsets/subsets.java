import java.util.*;

class subsets{
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<List<Integer>> ans = new ArrayList<>();
		subset(0, nums, new ArrayList<>(), ans);

		System.out.print(ans);
		System.out.println();
		iterations(nums);
	}

	static void subset(int i, int[] nums, List<Integer> list, List<List<Integer>> ans){
		if(i >= nums.length){
			ans.add(new ArrayList<>(list));
			return;
		}

		// pick 
		list.add(nums[i]);
		subset(i+1, nums, list, ans);
		list.remove(list.size()-1);
		subset(i+1, nums, list, ans);

		// not pick
	}

	static void iterations(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); // start with empty subset

        for (int num : nums) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(ans.get(i));
                newSubset.add(num);
                ans.add(newSubset);
            }
        }

        System.out.println(ans);
	}
}