package Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElementFromSortedMatrix {
	public int getKthsmallestElement(int[][] nums, int k) {
		int ans =0;
		PriorityQueue<tuple> heap = new PriorityQueue<tuple>();
		for(int i=0; i<nums.length; i++) {
			heap.offer(new tuple(i,0,nums[i][0]));
		}
		return ans;
	}
	
	class tuple implements Comparable<tuple>{
		int x,y,val;
		tuple(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val=val;
		}
		public int compareTo(tuple t){
			return val-t.val;
		}
	}
	

}
