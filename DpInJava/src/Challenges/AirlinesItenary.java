package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class AirlinesItenary {
	public static List<String> reconstructItenary(String[][] tickets){
		Map<String, PriorityQueue<String>> store = new HashMap<String, PriorityQueue<String>>();
	    for(String[] s : tickets){
	        PriorityQueue<String> pq =  store.getOrDefault(s[0], new PriorityQueue<String>());
	        pq.add(s[1]);
	        store.put(s[0], pq);
	    }
	    List<String> ans = new ArrayList<String>();
	    String currentCity = "JFK";
	    ans.add(currentCity);
	    while(!store.get(currentCity).isEmpty()){
	        currentCity = store.get(currentCity).poll();
	        ans.add(currentCity);
	        
	    }
	    return ans;
	}	

}
