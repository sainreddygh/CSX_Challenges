package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestDistancePoints {
	public static List<List<Integer>> getPoints(List<List<Integer>> allPoints, int n){
		List<List<Integer>> ans = new ArrayList<>();
		PriorityQueue<List<Integer>> q =  new PriorityQueue<>((a,b)->distance(b)-distance(a));
		for(List<Integer> p : allPoints) {
			q.add(p);			
		}
		while(n-- > 0) {
			ans.add(q.poll());
		}
		
		return ans;
	} 
	private static int distance(List<Integer> a) {
		return a.get(0)* a.get(0) + a.get(1)*a.get(1);
	}
}
