import java.util.*;

class combinationSum{
	public static void main(String[] args){
		List<List<Integer>> answer = new ArrayList<>();
		int[] candidates = {2,3,6,7};
		int target = 7;
		combinationSum(0, candidates, target, new ArrayList<>(), answer);

		System.out.print(answer);
	}


	static void combinationSum(int index, int[] candidates, int target, List<Integer> list, List<List<Integer>> answer) {
        if(target == 0){
        	answer.add(new ArrayList<>(list));
        	return;
        }

        if(index >= candidates.length || target < 0)
        	return;

        list.add(candidates[index]);
        combinationSum(index, candidates, target-candidates[index], list, answer);
        list.remove(list.size()-1);
        combinationSum(index+1, candidates, target, list, answer);
    }
}