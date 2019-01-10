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
            
//            int[] primeLevels  = new int[3];
//            int[] primes = new int[]{2,3,5};
//            List<Integer> ans =  new ArrayList<Integer>();
//            ans.add(1);
//            while(ans.size()<n){
//                int lastVal = ans.get(ans.size()-1);
//                int indexToIncrease = -1;
//                int currentMin = 0;
//                for(int i = 0; i<primes.length; i++){
//                    int currentVal = primes[i]*ans.get(primeLevels[i]);
//                    if(currentVal<=lastVal) primeLevels[i]++;
//                    if(currentVal>lastVal && (indexToIncrease==-1 || currentVal<currentMin)){
//                        currentMin = currentVal;
//                        primeLevels[i]++;
//                        if(indexToIncrease!=-1){
//                            primeLevels[indexToIncrease]--;
//                        }
//                        indexToIncrease = i;
//                        // if(indexToIncrease!=-1) primeLevels[indexToIncrease]--;
//                        // primeLevels[i]++;
//                        // indexToIncrease = i;                    
//                        // currentMin = currentVal;
//                    }
//                }
//                ans.add(currentMin);
//            }
//            return ans.get(ans.size()-1);   
        }
        System.out.println(ans);
        return ans.get(ans.size()-1);
	}
}
