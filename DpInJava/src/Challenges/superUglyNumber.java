package Challenges;

import java.util.ArrayList;
import java.util.List;

public class superUglyNumber {
	public static int nthNumber(int n, int[] primes) {
		int[] dp = new int[primes.length];
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);        
        while(ans.size()<n){
            int lastVal = ans.get(ans.size()-1);
            int currentMin = lastVal;
            int currentIndex = -1;
            for(int i =0; i<primes.length; i++){
            	int currentValue = primes[i]*ans.get(dp[i]);
            	if(lastVal >= currentValue) {
            		dp[i]++;
            	}
            	if(currentIndex != -1 && currentMin<primes[i]) {
            		break;
            	}
                if(currentValue>lastVal && (currentIndex == -1 || currentValue <currentMin)){
                	currentMin = currentValue;
                    dp[i]++;
                    if(currentIndex!=-1){
                        dp[currentIndex]--;
                    }
                    currentIndex = i;
                }
            }
            ans.add(currentMin);
        }
        return ans.get(ans.size()-1);
	}
}
