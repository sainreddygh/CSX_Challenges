package Challenges;

public class ShortestSubArray {
	public static int getLength(int[] A, int K) {
        int N= A.length;
        int p1=0;
        int p2=0;
        int ans = N+1;
        int currentSum = A[0];
        boolean inc = true;
        while(p1<=p2 && p2<N){
            if(A[p2] >=K) return 1;
            if(p1==p2){
                inc = true;
                p2++;
                currentSum+= p2==N ? 0 : A[p2];
            }else if(inc && currentSum>= K){
                ans = Math.min(ans, p2-p1+1);
                inc = false;
                currentSum-=A[p1++];
            }else if(inc){
            	p2++;
            	currentSum+= p2==N ? 0 : A[p2];
            }else if(!inc){
                ans = currentSum>=K ? Math.min(ans, p2-p1+1) : ans;
                currentSum-=A[p1++];                
            }
        }
        return ans>N ? -1 : ans;
    }
}
