import java.util.*;

class isHappy{
	public static void main(String[] args){
		int n = 3;
		System.out.print(isHappy(n));
	}


	static boolean efficientApproach(int n){
		int slow = n;
		int fast = n;

		while(true){
			slow = getSquares(slow);
			fast = getSquares(getSquares(fast));

			if(slow == fast) break;
		}

		return slow == 1;
	}

	static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);

        while(true){

        	int squares = getSquares(n);
        	if(squares == 1)
        		return true;

        	if(set.contains(squares))
        		return false;
        	else 
        		set.add(squares);
        	n = squares;
        }
       
    }

    static int getSquares(int n){
    	int sum = 0;
    	while(n != 0){
    		int rem = n % 10;
    		sum += rem * rem;
    		n /= 10;
    	}

    	return sum;
    }
}