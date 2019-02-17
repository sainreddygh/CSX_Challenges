package Challenges;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinWindowSubString {
	public String minWindow(String s, String t) {
		int f=-1;
        int e=s.length();
        int targetL =t.length();
        Deque<Integer> q =  new ArrayDeque();
        int[] tA = new int[255];
        Arrays.fill(tA,Integer.MIN_VALUE);
        for(int i = 0; i<t.length(); i++){
            int k =t.charAt(i)-' '; 
            if(tA[k]==Integer.MIN_VALUE) tA[k]=1;
            else tA[k]++;
        }
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i)-' ';
            if(tA[c]==Integer.MIN_VALUE) continue;
            if(f==-1)f=i;
            q.offer(i);
            tA[c]--;
            if(tA[c]>=0)targetL--;
            while(tA[s.charAt(q.peek())-' ']<0 && tA[s.charAt(q.peek())-' ']>-1-s.length()){
                tA[s.charAt(q.peek())-' ']++;
                q.poll();
            }
            if(targetL ==0 && e-f>i-q.peek()){
                f =q.peek();
                e =i;
            }
        }
        if(e==s.length()) return "";
        return s.substring(f,e+1);
    }
}