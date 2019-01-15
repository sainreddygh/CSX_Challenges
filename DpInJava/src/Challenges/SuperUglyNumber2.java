package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SuperUglyNumber2 {
	public static int nthSuperUglyumber(int n, int[] primes) {
//		PriorityQueue<Num> pq =  new PriorityQueue<>();
//		pq.add(new Num(10));
//		System.out.println(pq.peek().val);
//		pq.add(new Num(1));
//		System.out.println(pq.peek().val);
//		pq.add(new Num(20));
//		System.out.println(pq.peek().val);
//		pq.poll();
//		System.out.println(pq.peek().val);
//		pq.add(new Num(11));
//		System.out.println(pq.peek().val);
//		pq.poll();
//		System.out.println(pq.peek().val);
		
		Num[] nums = new Num[] {new Num(3), new Num(9), new Num(4), new Num(6), new Num(2) };
		for(Num m : nums) System.out.println(m.val);
		Arrays.sort(nums);
		for(Num m : nums) System.out.println(m.val);
		return 0;
	}
	
	private static class Num implements Comparable<Num>{
		int val;
		
		Num(int v){
			val = v;
		}
		
		@Override
		public int compareTo(Num that) {
			return this.val - that.val;
		}		
		
	}

}
