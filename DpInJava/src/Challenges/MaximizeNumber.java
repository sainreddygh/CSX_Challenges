package Challenges;

import java.util.Stack;

public class MaximizeNumber {
	public int maximumSwap(int num) {
		int[] values = new int[9];
		int i=0;
		while(i<9 && num%10!=0) {
			values[i++]=num%10;
			num/=10;
		}
		int minIndex = i;
		while(minIndex>0 && values[minIndex]>values[minIndex-1])minIndex--;
		if(minIndex==0) return num;
		int maxIndex = minIndex-1;
		for(int j = maxIndex; j>=0; j--) {
			if(values[j]>values[maxIndex]) {
				while(minIndex<i && values[minIndex+1]<values[j])minIndex++;
				maxIndex=j;
			}
		}
		int t = values[minIndex];
		values[minIndex] = values[maxIndex];
		values[maxIndex] = t;
		int ans=1;
		while(i>=0) {
			ans=ans*10+values[i--];
		}
		return ans;
    }
}
