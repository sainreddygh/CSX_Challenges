package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumDistancePoints {
	public static List<List<Integer>> getMiniDistancePoints(int totalLocations, List<List<Integer>> locations, int numDliveries) {
		List<List<Integer>> ans =  new ArrayList<>();
		PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>((a,b)->distance(b)-distance(a));
		for(List<Integer> l : locations) {
			pq.add(l);
		}
		for(int i=0; i<numDliveries; i++) {
			ans.add(pq.poll());
		}
		return ans;
	}
	private static int distance(List<Integer> l) {
		return l.get(0) * l.get(0) + l.get(1)* l.get(1);
	}
}
