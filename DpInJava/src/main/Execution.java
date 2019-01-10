package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;

public class Execution {
	public static void main(String[] args) {
		superUglyNumber.nthNumber(37, primes)
	}
}

int[] dp = new int[primes.length];
List<Integer> ans = new ArrayList<Integer>();
ans.add(1);        
while(ans.size()<n){
    int lastVal = ans.get(ans.size()-1);
    int currentMin = lastVal;
    int currentIndex = -1;
    for(int i =0; i<primes.length; i++){
    	if(lastVal >= primes[i]*ans.get(dp[i])) {
    		dp[i]++;
    	}
        if(primes[i]*ans.get(dp[i])>lastVal && (currentIndex == -1 || primes[i]*ans.get(dp[i]) <currentMin)){
        	currentMin = primes[i]*ans.get(dp[i]);
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
