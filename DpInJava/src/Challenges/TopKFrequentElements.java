package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	public static List<Integer> topKFrequent(int[] nums, int k){
		Map<Integer, Integer> map =  new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> q =  new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            q.add(m.getKey());
        }
        List<Integer> ans =  new ArrayList<>();
        while(k>0){
            ans.add(q.poll);
        }
        return ans;
	}

}
