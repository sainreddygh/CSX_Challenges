package Challenges;

public class CoinChange2 {
	public int getCombinations(int amount, int[] coins) {
		return helper(amount, coins, 0);
		
	}
	public int helper(int amount, int[] coins, int start) {
		if(amount == 0) return 1;
		if(start>= coins.length || amount < coins[start]) return 0;
		return helper(amount - coins[start], coins, start) + helper(amount, coins, start+1);
	}

}
