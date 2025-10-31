import java.util.*;

class letterCombinations{
	public static void main(String[] args){
		String digits = "233";
		List<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		StringBuilder sb = new StringBuilder();
		combination(digits, 0, map, list, sb);
		System.out.print(list);
	}

	static void combination(String digits, int index, HashMap<Integer, String> map, List<String> list, StringBuilder sb){

		if(index == digits.length()){
			list.add(sb.toString());
			return;
		}

		int num = digits.charAt(index) - '0';
		String word = map.get(num);
		for(int i = 0;i<word.length();i++){
			sb.append(word.charAt(i));
			combination(digits, index+1, map, list, sb);
			sb.deleteCharAt(sb.length()-1);
		}

	}


}