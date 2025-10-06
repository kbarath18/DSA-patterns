import java.util.*;


class findMaxAverage{
	public static void main(String[] args){

		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;

		System.out.print(findMaxAverage(nums, k));

	}

	static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double max = Double.NEGATIVE_INFINITY;;
        for(int i = 0;i<nums.length;i++){

        	sum += nums[i];

        	if(i >= k-1){
	        	double calcuate = (double) sum / k;
	        	ans = Math.max(ans, calcuate);
	        	sum -= nums[i - (k -1)];
        	}



        }

        return ans;
        

    }	
}