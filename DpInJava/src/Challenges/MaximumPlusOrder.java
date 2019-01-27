package Challenges;

import java.util.HashSet;
import java.util.Set;

public class MaximumPlusOrder {
	public static int getOrder(int N, int[][] mines) {
		int ans = 0;
		int[][] dp = new int[N][N];
		int count;
		Set<Integer> zeros =  new HashSet<>();
		for(int[] mine : mines) {
			zeros.add(mine[0]*N + mine[1]);
		}
		for(int r=0; r<N; ++r) {
			count=0;
			for(int c=0; c<N; ++c) {
				count = zeros.contains(r*N+c) ? 0 : count+1;
				dp[r][c] = count;
			}
			count=0;
			for(int c=N-1; c>=0; --c) {
				count = zeros.contains(r*N+c) ? 0 : count+1;
				dp[r][c] = Math.min(dp[r][c], count);
			}
		}
		for(int c=0; c<N; ++c) {
			count=0;
			for(int r=0; r<N; ++r) {
				count = zeros.contains(r*N+c) ? 0 : count+1;
				dp[r][c] = Math.min(dp[r][c], count);
			}
			count=0;
			for(int r=N-1; r>=0; --r) {
				count = zeros.contains(r*N+c) ? 0 : count+1;
				dp[r][c] = Math.min(dp[r][c], count);
				ans = Math.max(ans, dp[r][c]);
			}
		}
		return ans;
	}

}
