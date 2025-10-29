import java.util.*;

public class trap{
	public static void main(String[] args){
 		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
 		
 		System.out.print(trap(height));
	}

	static int trap(int[] height) {
        int count = 0;
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        suffix[suffix.length-1] = height[height.length-1];
        prefix[0] = height[0];

        for(int i = 1;i<height.length;i++){
        	prefix[i] = Math.max(prefix[i-1], height[i]);
        }

        // suffix sum
        for(int i = height.length-2;i>=0;i--){
        	suffix[i] = Math.max(suffix[i+1], height[i]);
        }

        
        for(int i = 1;i<height.length;i++){

        	if(suffix[i] > height[i] && prefix[i] > height[i]){
        		count += Math.min(prefix[i], suffix[i]) - height[i];
        	}

        }

        return count;
    }
}