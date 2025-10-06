import java.util.*;

class lengthOfLongestSubstring{
	public static void main(String[] args){
		String s = "abcmbcbbacmolh";

		System.out.print(lengthOfLongestSubstring(s));
	}

	static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;

        int start = 0;
        int end = 0;
        while(end < s.length()){
        	char letter = s.charAt(end);

        	while(set.contains(letter)){
        		set.remove(s.charAt(start));
        		start++;
        	}

        	set.add(letter);
        	result = Math.max(set.size(), result);

        	end++;
        }
        return result;
    }
}