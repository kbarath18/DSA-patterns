import java.util.*;

class isPalindrome{
	public static void main(String[] args){
		String s = "A man, a plan, a canal: Panama";
		
		System.out.print(method2(s));


	}

	static boolean method1(String s){

		s = s.toLowerCase();
		String ans = "";
		for(int i = 0;i<s.length();i++){
			char letter = s.charAt(i);
			if(Character.isLetterOrDigit(letter)){
				ans += letter;
			}
		}
		// 1st method
		// using two pointer
		int start = 0;
		int end = ans.length()-1;

		while(start < end){
			char letter1 = ans.charAt(start);
			char letter2 = ans.charAt(end);
			if(letter1 != letter2)
				return false;

			start++;
			end--;
		}

		return true;
	}

	static boolean method2(String s){
		int start = 0;
		int end = s.length()-1;

		while(start < end){
			

			// skip the non- alphanumeric
			while(start < end && !Character.isLetterOrDigit(s.charAt(start)))
				start++;

			// skip the non - alphanumber
			while(start < end && !Character.isLetterOrDigit(s.charAt(end)))
				end--;


			if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				return false;

			start++;
			end--;



		}

		return true;
		

	}
}