import java.util.*;


class Main{
	public static void main(String[] args){	
		Scanner scan = new Scanner(System.in);

		List<List<Integer>> list = new ArrayList<>();
			
		
		String name = "barath";
		changeName(name);

		System.out.print(name);

		int[] arr = {1,2,3,4};
		changeArr(arr);

		System.out.print(Arrays.toString(arr));


	}

	static void changeArr(int[] arr){
		arr[0] = 100;
	}

	static void changeName(String name){
		name = "Kumar";
	}

	static void nothing(int[] arr){
		arr[0] = 1000;
		System.out.println(Arrays.toString(arr));
	}

	static void nothing(int a){
		a = 100;
		System.out.println(a);
	}
}