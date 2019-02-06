package Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElementFromSortedMatrix {
	public int getKthsmallestElement(int[][] nums, int k) {
		int m = nums.length;
		int n = nums[0].length;
		PriorityQueue<tuple> heap = new PriorityQueue<tuple>();
		for(int i=0; i<m; i++) {
			heap.offer(new tuple(i,0,nums[i][0]));
		}
		while(k>0) {
			tuple t = heap.poll();
			if(t.y<n-1) {
				heap.offer(new tuple(t.x, t.y+1, nums[t.x][t.y+1]));
			}
			k--;
		}
		return heap.poll().val;
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
