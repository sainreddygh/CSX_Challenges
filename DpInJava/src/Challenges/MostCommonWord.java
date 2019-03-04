package Challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map =  new HashMap();
        Set<String> set = new HashSet();
        for(String s : banned){
            set.add(s);
        }
        String[] sA = paragraph.split(",|\\.|\"|!|\\?|'| ");
        String ans = "";
        int count = 0;
        for(String s : sA){
            String sl = s.toLowerCase();
            if(!set.contains(sl)){
                map.put(sl,map.getOrDefault(sl,0)+1);
                if(map.get(sl)>count) {
                    ans = sl;
                    count = map.get(sl);
                }
            }
        }
        return ans;
    }
}
