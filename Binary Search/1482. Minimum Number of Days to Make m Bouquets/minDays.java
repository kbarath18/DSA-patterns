import java.util.*;

class minDays{
	public static void main(String[] args){
		int[] bloomDay = {7,7,7,7,12,7,7};
		int m = 2;
		int k = 3;

		System.out.print(minDays(bloomDay, m, k));
	}

	static int minDays(int[] bloomDay, int m, int k) {
       	int start = Integer.MAX_VALUE;
       	int end = Integer.MIN_VALUE;
       	int ans = -1;
       	for(int i: bloomDay){
       		start = Math.min(start, i);
       		end = Math.max(end, i);
       	}

       	while(start <= end){
       		int mid = start + (end - start) / 2;
       		if(canBloom(bloomDay, mid, m, k)){
       			ans = mid;
       			end = mid-1;
       		}else{
       			start = mid+1;
       		}

       	}

       	return ans; 
    }

    static boolean canBloom(int[] nums, int mid, int boque, int k){
    	int totalBoque = 0;

    	int adajacent = 0;
    	for(int i = 0;i<nums.length;i++){
    		if(nums[i] <= mid){
    			adajacent++;
    			if(adajacent == k){
    				adajacent = 0;
    				totalBoque++;
    			}
    		}else{
    			adajacent = 0;
    		}
    	}


    	return boque <= totalBoque;
    }
}