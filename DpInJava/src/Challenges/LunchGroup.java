package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LunchGroup {
	public List<List<String>> getRandomGroups(List<String> mainGroup){
		List<List<String>> res =  new ArrayList();
		Random rand =  new Random();
		List<String> curList =  new ArrayList();
		while(mainGroup.size()>2) {
			if(curList.size()==3) {
				res.add(curList);
				curList = new ArrayList();
			}				
			int randInt = rand.nextInt(mainGroup.size());			
			curList.add(mainGroup.get(randInt));
			mainGroup.remove(randInt);
		}
		curList.addAll(mainGroup);
		res.add(curList);
		return res;
	}
	public int f(int x, int K, int N) {
        int ans = 0, r = 1;
        for (int i = 1; i <= K; ++i) {
            r *= x-i+1;
            r /= i;
            ans += r;
            if (ans >= N) break;
        }
        return ans;
    }

}
