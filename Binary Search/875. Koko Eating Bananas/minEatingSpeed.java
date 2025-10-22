import java.util.*;

class minEatingSpeed{
	public static void main(String[] args){
		int[] piles = {30,11,23,4,20};
		int h = 6;

		System.out.print(minEatingSpeed(piles, h));

	}

	static int minEatingSpeed(int[] piles, int h) {
		int minSpeed = 0;
		int start = Integer.MAX_VALUE;
		int end = -1;
		for(int i: piles){
			start = Math.min(i, start);
			end = Math.max(i, end);

		}

		while(start <= end){
			int mid = start + (end - start)/2;
			if(canEat(piles, mid,h) <= h){
				minSpeed = mid;
				end = mid-1;
			}else{
				start = mid+1;
			}

		}

        return minSpeed;
    }	

    static int canEat(int[] nums, int mid, int hour){
    	int total = 0;
    	for(int i: nums){
    		total += (int) Math.ceil((double)i/mid);
    	}

    	return total;
    }
}