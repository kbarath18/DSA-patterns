import java.util.*;

class maxArea{
	public static void main(String[] args){
		int[] height = {1,8,6,2,5,4,8,3,7};

		System.out.print(maxArea(height));
	}

	static int maxArea(int[] height) {
        
        int max = 0;

        int start = 0;
        int end = height.length-1;

        while(start < end){
        	int area = Math.min(height[start],height[end]) * (end - start);
        	max = Math.max(area, max);

        	if(height[start] > height[end]) end--;
        	else start++;
        }

        return max;

    }
}