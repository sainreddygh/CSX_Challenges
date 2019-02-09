package Challenges;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Unlock {
	public int openLock(String[] deadends, String target) {
		Arrays.sort(deadends);
        int moves = 0;
        int[][][][] done = new int[10][10][10][10];
        ArrayDeque<int[]> q =  new ArrayDeque();
        q.offer(new int[]{0,0,0,0});
        done[0][0][0][0] = 1;
        while(!q.isEmpty()){
            ArrayDeque<int[]> newQ =  new ArrayDeque();            
            while(!q.isEmpty()){
                int[] cur = q.poll();
                String s =  ""+cur[0]+cur[1]+cur[2]+cur[3];
                if(Arrays.binarySearch(deadends, s)>-1) break;
                if(target.equals(s)) return moves;
                for(int i=0; i<4; i++){
                    int[] firstArray = cur.clone();
                    int[] secondArray = cur.clone();
                    firstArray[i] =  firstArray[i]==9 ? 0 : firstArray[i]+1;
                    secondArray[i] =  secondArray[i]==0 ? 9 : secondArray[i]-1;
                    if(done[firstArray[0]][firstArray[1]][firstArray[2]][firstArray[3]]==0){
                        newQ.offer(firstArray);
                        done[firstArray[0]][firstArray[1]][firstArray[2]][firstArray[3]]=1;
                    }
                    if(done[secondArray[0]][secondArray[1]][secondArray[2]][secondArray[3]]==0){
                        newQ.offer(secondArray);
                        done[secondArray[0]][secondArray[1]][secondArray[2]][secondArray[3]]=1;
                    }
                }
            }
            q = newQ;
            moves++;
        }
        return -1;          
    }  
}
