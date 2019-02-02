package Challenges;

import java.util.Arrays;

public class MaxLenPairChain {
	public static int getLongestChainLength(int[][] pairs) {
		int n = pairs.length;
		if(n<2) return n;
		Arrays.sort(pairs, (a, b)->{return b[1]- a[1];});
		int ans = 1;
		int[] lastPair = pairs[0];
		for(int i=1; i<n; i++) {
			if(pairs[i][0]>lastPair[1]) {
				ans++;
				lastPair = pairs[i];
			}
		}		
		return ans;
	}

}
