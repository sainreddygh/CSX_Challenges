package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QReconstructionByHeight {
	public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b)->{
            if(a[0]<b[0]) return 1;
            if(a[0]>b[0]) return -1;
            if(a[0]==b[0] && a[1]<b[1]) return -1;
            else return 1;
        });
        List<int[]> list = new ArrayList();
        for(int i=0; i<people.length; i++) {
        	list.add(people[i][1], people[i]);
        }
        int[][] ans =  new int[people.length][2];
        for(int i=0; i<list.size(); i++) {
        	ans[i]=list.get(i);
        }
        return ans;
    }
    class Point{
        int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
