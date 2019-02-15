package Challenges;

import java.util.HashMap;
import java.util.Map;

public class MaxAreaRectangle {
	public int getMaxArea(int[] heights) {
		int n = heights.length;
		int ans = 0;
		int[] leftP = new int[n];
		int[] rightP = new int[n];
		for(int i=0; i<n; i++) {
			int p=i-1;
			while(p>0 && heights[p]>=heights[i]) {
				p=leftP[p];
			}
			leftP[i]=p;
		}
		rightP[n-1]=-1;
		for(int i=n-2; i>=0; i--) {
			int p=i+1;
			while(p<n-1 && heights[p]>=heights[i]) {
				p=rightP[p];
			}
			rightP[i]=p;
		}
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, heights[i]*(i-leftP[i]+rightP[i]-i-1));
		}
		return ans;
	}

}
