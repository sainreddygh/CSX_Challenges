package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class Deprost {
	public static List<Integer> getTopol(int num, int[][] edges){
		List<Integer> ans =  new ArrayList<Integer>();
		Map<Integer, Integer> deps = new HashMap<Integer, Integer>(); 
		Queue<Integer> q = new LinkedList<Integer>();
		Map<Integer, List<Integer>> adjs = new HashMap<Integer, List<Integer>>();
		for(int[] edge : edges) {
			List<Integer> lst =  adjs.getOrDefault(edge[1], new ArrayList<Integer>());
			lst.add(edge[0]);
			adjs.put(edge[1], lst);
			deps.put(edge[0], deps.getOrDefault(edge[0], 0)+1);			
		}
		
		for(int[] edge : edges) {
			if(!deps.containsKey(edge[1])) {
				deps.put(edge[1], 0);
				q.add(edge[1]);
			}
		}
		while(!q.isEmpty()) {
			int noDep = q.poll();
			if(!adjs.containsKey(noDep)) {
				ans.add(noDep);
				continue;
			}
			for(int i : adjs.get(noDep)) {
				if(deps.get(i)==1) 
					q.add(i);
				else {
					deps.put(i, deps.get(i)-1);
				}				
			}
			ans.add(noDep);
		}
		
		return ans;
		
//		int[] result = new int[numCourses];
//        int coursesTaken = 0;
//        int[] preReqCount = new int[numCourses];
//        int[][] preReqs = new int[numCourses][numCourses];
//        for(int[] pr : prerequisites){
//            preReqCount[pr[0]]++;
//            preReqs[pr[1]][pr[0]]=1;
//        }
//        Queue<Integer> q = new LinkedList<Integer>();
//        for(int i=0; i<preReqCount.length; i++){
//            if(preReqCount[i]==0){
//                q.offer(i);
//            }
//        }
//        while(!q.isEmpty()){
//            int done = q.remove();
//            result[coursesTaken++]=done;
//            for(int i=0; i<preReqs[done].length; i++){
//                if(preReqs[done][i]!=0 && --preReqCount[i]==0){
//                    q.offer(i);          
//                }
//            }
//        }
//        if(coursesTaken<numCourses){
//            return new int[0];
//        }else return result;
//        
	}

}
