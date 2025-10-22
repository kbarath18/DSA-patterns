import java.util.*;

class mySqrt{
	public static void main(String[] args){
		int x = 16;
		System.out.print(mySqrt(x));
	}

	static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = -1;


        while(start <= end){
        	int mid = start + (end - start) / 2;
        	int sqrt = mid * mid;
        	if(sqrt <= x){
        		ans = mid;
        		start = mid+1;
        	}else{
        		end = mid-1;
        	}
        }

        return ans;
    }
}