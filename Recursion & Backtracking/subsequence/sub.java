import java.util.*;

public class sub{
	static List<List<Integer>> answer = new ArrayList<>();
	public static void main(String[] args){
		
		int[] arr = {1,2,1};
		List<Integer> num = new ArrayList<>();
		subsequenceSum(0, 2, arr, num);

		System.out.print(answer);
	}

	static void subsequence(int index, int[] arr, List<Integer> num){
		if(index == arr.length){
			answer.add(new ArrayList<>(num));
			return;
		}

		// pick 
		num.add(arr[index]);
		subsequence(index+1, arr, num);
		// not pick
		num.remove(num.size()-1);
		subsequence(index+1, arr, num);
	}

	static boolean subsequenceSum(int index, int sum, int[] arr, List<Integer> list){

		if(sum == 0){
			System.out.print(list);
			return true;
		}

		if(sum < 0 || index >= arr.length)
			return false;

		

		list.add(arr[index]);
		if(subsequenceSum(index+1, sum-arr[index], arr, list))
			return true;
		list.remove(list.size()-1);
		if(subsequenceSum(index+1, sum, arr, list))
			return true;

		return false;

	}
}