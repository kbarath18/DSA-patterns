import java.util.*;

class checkInclusion{
	public static void main(String[] args){
		String s1 = "abc", s2 = "bbbcccaacb";
		
		System.out.print(checkInclusion(s1, s2));

	}

	static boolean checkInclusion(String s1, String s2) {
		int[] arr1 = new int[s1.length()];
		int[] arr2 = new int[26];

		for(int i = 0;i<s1.length();i++)
			arr1[s1.charAt(i) - 'a']++;

		// adding into second array
		for(int i = 0;i<s1.length();i++)
			arr2[s2.charAt(i) - 'a']++;

		if(equals(arr1, arr2)) return true;

		int start = 0;
		int end = s1.length();

		while(end < s2.length()){
			// remove the start element
			arr2[s2.charAt(start) - 'a']--;
			start++;
			// add new element
			arr2[s2.charAt(end) - 'a']++;

			if(equals(arr1, arr2)) return true;

			end++;
		}

		return false;

    }

    static boolean equals(int[] a, int b[]){
    	// checking two array are equal or not

    	for(int i = 0;i<a.length;i++){
    		if(a[i] != b[i]) return false;
    	}
    	return true;
    }
}