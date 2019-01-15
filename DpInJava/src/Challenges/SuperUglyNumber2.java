package Challenges;

import java.util.PriorityQueue;

public class SuperUglyNumber2 {
	public int nthSuperUglyumber(int n, int[] primes) {
		PriorityQueue<Num> pq =  new PriorityQueue<>();
		pq.add(new Num(10));
		System.out.println(pq.peek());
		pq.add(new Num(1));
		System.out.println(pq.peek());
		pq.add(new Num(20));
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		pq.add(new Num(11));
		System.out.println(pq.peek());
		return 0;
	}
	
	private class Num implements Comparable<Num>{
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
