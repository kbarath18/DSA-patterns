import java.util.*;

class characterReplacement{
	public static void main(String[] args){

		String s = "AABABBA";
		int k = 1;

		System.out.print(characterReplacement(s, k));

	}

	static int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int start = 0;
        int end = 0;
        int maxFreq = 0;
        int windowSize = 0;
        int maxWindow = 0;
 
        while(end < s.length()){
        	char letter = s.charAt(end);
        	map[letter - 'A']++;

        	maxFreq = Math.max(maxFreq, map[letter-'A']); // this is trickest part
        	windowSize = end - start + 1;

        	if((windowSize-maxFreq) > k){
        		map[s.charAt(start) - 'A']--;
        		start++;
        	}

        	windowSize = end - start + 1;
        	maxWindow = Math.max(maxWindow, windowSize);

        	end++;
        }

        return maxWindow;
    }
}