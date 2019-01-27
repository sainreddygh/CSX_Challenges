package Challenges;

import java.util.Arrays;

public class LongestFibSubSeq {
	public static int getMaxLength(int[] A) {
		int[] dp =  new int[A.length];
        int ans = 0;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                int res = Arrays.binarySearch(A, j+1, A.length, A[i]+A[j]);
                if(res>0){
                    dp[res] =  Math.max(dp[res], dp[i]+2);
                    if(ans<dp[res]) {
                    	System.out.println(res);
                    }
                    ans = Math.max(ans, dp[res]);
                }
            }
        }
        return ans+1;
	}
}
