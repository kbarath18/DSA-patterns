import java.util.*;

class findSubstring{
	public static void main(String[] args){

		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};

		
		List<Integer> list = findSubstring(s, words);

		System.out.print(list);

		

	}

	static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> list = new ArrayList<>();
    if (s.length() == 0 || words.length == 0) return list;

    HashMap<String, Integer> map = new HashMap<>();
    for (String word : words)
        map.put(word, map.getOrDefault(word, 0) + 1);

    int wordLength = words[0].length();
    int totalWords = words.length;
    int windowLength = wordLength * totalWords;

    // Check all starting points within word length
    for (int i = 0; i < wordLength; i++) {
        int left = i;
        int countTotalWords = 0;
        HashMap<String, Integer> currMap = new HashMap<>();

        for (int j = i; j <= s.length() - wordLength; j += wordLength) {
            String subString = s.substring(j, j + wordLength);

            if (map.containsKey(subString)) {
                currMap.put(subString, currMap.getOrDefault(subString, 0) + 1);
                countTotalWords++;

                // If a word occurs more than required, shrink window from left
                while (currMap.get(subString) > map.get(subString)) {
                    String leftWord = s.substring(left, left + wordLength);
                    currMap.put(leftWord, currMap.get(leftWord) - 1);
                    countTotalWords--;
                    left += wordLength;
                }

                // If we found all words, add starting index
                if (countTotalWords == totalWords) {
                    list.add(left);
                }
            } else {
                // Word not in list, reset everything
                currMap.clear();
                countTotalWords = 0;
                left = j + wordLength;
            }
        }
    }

    return list;
}


    
}