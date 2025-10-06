import java.util.*;

class minWindow{
	public static void main(String[] args){
		String s = "ADOBECODEBANC", t = "ABC";

		System.out.print(minWindow(s, t));
	}

	static String minWindow(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int count = 0;

		int startIndex = -1;
		int endIndex = -1;
		int subStringLength = Integer.MAX_VALUE;

		for(int i = 0;i<t.length();i++)
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);


		while(end < s.length()){
			char letter = s.charAt(end);

			if(map.containsKey(letter)){
				if(map.get(letter) > 0)
					count++;
				map.put(letter, map.getOrDefault(letter, 0) -1);

			}else{
				map.put(letter, -1);
			}

			while(count == t.length()){
				// calculations starts here
				

				int length = (end - start) + 1;
				if(subStringLength > length){
					subStringLength = length;
					startIndex = start;
					endIndex = end;
				}
				// decrement
				char startingLetter = s.charAt(start);
				map.put(startingLetter, map.get(startingLetter) + 1);
				if(map.get(startingLetter) == 1)
					count--;

				start++;
			}

			end++;
		}

        return s.substring(startIndex, endIndex+1);
    }
}