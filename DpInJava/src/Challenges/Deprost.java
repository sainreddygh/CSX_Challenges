package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class Deprost {
	public List<Integer> getTopol(int[][] edges){
		List<Integer> ans =  new ArrayList<Integer>();
		Map<Integer, Integer> deps = new HashMap<Integer, Integer>(); 
		Queue<Integer> q = new LinkedList<Integer>();
		Map<Integer, List<Integer>> adjs = new HashMap<Integer, List<Integer>>();
		for(int[] edge : edges) {
			List<Integer> lst =  adjs.getOrDefault(edge[1], new ArrayList<Integer>());
			lst.add(edge[0]);
			deps.put(edge[0], deps.getOrDefault(edge[0], 0)+1);			
		}
		
		for(Map.Entry<Integer, Integer> dep : deps.entrySet()) {
			if(dep.getValue()==0)q.add(dep.getKey());
		}
		while(!q.isEmpty()) {
			int noDep = q.poll();
			for(int i : adjs.get(noDep)) {
				if(deps.get(i)==1) 
					q.add(i);
				else {
					deps.put(deps.get(i), deps.get(i)-1);
				}				
			}
			ans.add(noDep);
		}
		
		return ans;
	}

}
